package br.com.dmeireles.restapplication.controller

import br.com.dmeireles.restapplication.controller.dto.ShoppingCartDataDto
import br.com.dmeireles.restapplication.controller.form.CreateShoppingCartForm
import br.com.dmeireles.restapplication.model.ShoppingCart
import br.com.dmeireles.restapplication.service.ItemService
import br.com.dmeireles.restapplication.service.ProductService
import br.com.dmeireles.restapplication.service.ShoppingCartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.transaction.Transactional

@RestController
@RequestMapping("/shopping-cart")
class ShoppingCartController {

    @Autowired
    private lateinit var productService: ProductService

    @Autowired
    private lateinit var itemService: ItemService

    @Autowired
    private lateinit var shoppingCartService: ShoppingCartService

    @PostMapping
    @Transactional
    fun create(
            @RequestBody createShoppingCartForm: CreateShoppingCartForm,
            uriBuilder: UriComponentsBuilder
    ): ResponseEntity<ShoppingCartDataDto> {

        val shoppingCart: ShoppingCart = createShoppingCartForm.converter(
                itemService = itemService,
                productService = productService
        )
        shoppingCartService.save(shoppingCart)
        val uri = uriBuilder.path("/shopping-cart/{id}").buildAndExpand(shoppingCart.id).toUri()
        return ResponseEntity.created(uri).body(ShoppingCartDataDto(shoppingCart))
    }
}