package br.com.dmeireles.restapplication.controller.form

import br.com.dmeireles.restapplication.model.Item
import br.com.dmeireles.restapplication.service.ProductService
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class CreateItemForm(
        @JsonProperty("product_id") private val productId: Long,
        private val quantity: Int
) {
    fun converter(productService: ProductService): Item {
        val now: LocalDateTime = LocalDateTime.now()
        return Item(
                product = productService.getById(productId),
                quantity = quantity,
                creationDate = now,
                lastUpdateDate = now
        )
    }
}