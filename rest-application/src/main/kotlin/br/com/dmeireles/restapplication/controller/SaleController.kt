package br.com.dmeireles.restapplication.controller

import br.com.dmeireles.restapplication.controller.dto.SaleDataDto
import br.com.dmeireles.restapplication.controller.form.CreateSaleForm
import br.com.dmeireles.restapplication.model.Sale
import br.com.dmeireles.restapplication.service.ClientService
import br.com.dmeireles.restapplication.service.SaleService
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
@RequestMapping("/sale")
class SaleController {

    @Autowired
    private lateinit var saleService: SaleService

    @Autowired
    private lateinit var clientService: ClientService

    @Autowired
    private lateinit var shoppingCartService: ShoppingCartService

    @PostMapping
    @Transactional
    fun create(
            @RequestBody createSaleForm: CreateSaleForm,
            uriBuilder: UriComponentsBuilder
    ): ResponseEntity<SaleDataDto> {
        val sale: Sale = createSaleForm.converter(
                clientService = clientService,
                shoppingCartService = shoppingCartService
        )
        saleService.save(sale)
        val uri = uriBuilder.path("/sale/{id}").buildAndExpand(sale.id).toUri()
        return ResponseEntity.created(uri).body(SaleDataDto(sale))
    }
}