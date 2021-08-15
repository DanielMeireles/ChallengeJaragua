package br.com.dmeireles.restapplication.controller

import br.com.dmeireles.restapplication.controller.dto.ProductDataDto
import br.com.dmeireles.restapplication.controller.form.CreateProductForm
import br.com.dmeireles.restapplication.model.Product
import br.com.dmeireles.restapplication.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.transaction.Transactional

@RestController
@RequestMapping("/product")
class ProductController {

    @Autowired
    private lateinit var productService: ProductService

    @PostMapping
    @Transactional
    fun create(
            @RequestBody createProductForm: CreateProductForm,
            uriBuilder: UriComponentsBuilder
    ): ResponseEntity<ProductDataDto> {
        val product: Product = createProductForm.converter()
        productService.save(product)
        val uri = uriBuilder.path("/product/{id}").buildAndExpand(product.id).toUri()
        return ResponseEntity.created(uri).body(ProductDataDto(product))
    }

}