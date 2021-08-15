package br.com.dmeireles.restapplication.controller.dto

import br.com.dmeireles.restapplication.model.Product
import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal
import java.time.LocalDateTime

class ProductDataDto(
        private val product: Product
) {
    @JsonProperty("product_id") val productId: Long? = product?.id
    val name: String? = product.name
    val description: String? = product.description
    val value: BigDecimal? = product.value
    @JsonProperty("creation_date") val creationDate: LocalDateTime? = product.creationDate
    @JsonProperty("last_update_date") val lastUpdateDate: LocalDateTime? = product.lastUpdateDate
}