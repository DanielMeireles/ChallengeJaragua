package br.com.dmeireles.restapplication.controller.dto

import br.com.dmeireles.restapplication.model.Item
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class ItemDataDto(
        private val item: Item
) {
    @JsonProperty("item_id") val itemId: Long? = item.id
    val product: ProductDataDto? = item.product?.let { ProductDataDto(it) }
    val quantity: Int? = item.quantity
    @JsonProperty("creation_date") val creationDate: LocalDateTime? = item.creationDate
    @JsonProperty("last_update_date") val lastUpdateDate: LocalDateTime? = item.lastUpdateDate
}