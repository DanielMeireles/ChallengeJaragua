package br.com.dmeireles.restapplication.controller.dto

import br.com.dmeireles.restapplication.model.Sale
import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal
import java.time.LocalDateTime

class SaleDataDto(
        private val sale: Sale
) {
    @JsonProperty("sale_id") val saleId: Long? = sale.id
    val client: ClientDataDto? = sale.client?.let { ClientDataDto(it) }
    val shoppingCart: ShoppingCartDataDto? = sale.shoppingCart?.let { ShoppingCartDataDto(it) }
    val discount: BigDecimal? = sale.discount
    @JsonProperty("creation_date") val creationDate: LocalDateTime? = sale.creationDate
    @JsonProperty("last_update_date") val lastUpdateDate: LocalDateTime? = sale.lastUpdateDate
}