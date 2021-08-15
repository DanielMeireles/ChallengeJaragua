package br.com.dmeireles.restapplication.controller.form

import br.com.dmeireles.restapplication.model.Client
import br.com.dmeireles.restapplication.model.Sale
import br.com.dmeireles.restapplication.model.ShoppingCart
import br.com.dmeireles.restapplication.service.ClientService
import br.com.dmeireles.restapplication.service.ShoppingCartService
import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

class CreateSaleForm(
        @JsonProperty("client_id") val clientId: Long,
        @JsonProperty("shopping_cart_id") val shoppingCartId: Long,
        val discount: BigDecimal
) {
    fun converter(
            clientService: ClientService,
            shoppingCartService: ShoppingCartService
    ): Sale {
        val client: Client = clientService.getById(clientId)
        val shoppingCart: ShoppingCart = shoppingCartService.getById(shoppingCartId)
        val now: LocalDateTime = LocalDateTime.now()
        return Sale(
                date = LocalDate.now(),
                client = client,
                shoppingCart = shoppingCart,
                discount = discount,
                creationDate = now,
                lastUpdateDate = now
        )
    }
}