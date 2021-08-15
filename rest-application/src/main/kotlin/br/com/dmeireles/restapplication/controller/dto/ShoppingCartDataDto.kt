package br.com.dmeireles.restapplication.controller.dto

import br.com.dmeireles.restapplication.model.Item
import br.com.dmeireles.restapplication.model.ShoppingCart
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class ShoppingCartDataDto(
    private val shoppingCart: ShoppingCart
) {
    @JsonProperty("shopping_cart_id") val shoppingCartId: Long? = shoppingCart.id
    val items: List<ItemDataDto>? = shoppingCart.items?.map { item: Item -> ItemDataDto(item) } ?: null
    @JsonProperty("creation_date") val creationDate: LocalDateTime? = shoppingCart.creationDate
    @JsonProperty("last_update_date") val lastUpdateDate: LocalDateTime? = shoppingCart.lastUpdateDate
}