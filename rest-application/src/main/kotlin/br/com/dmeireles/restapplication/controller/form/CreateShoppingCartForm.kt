package br.com.dmeireles.restapplication.controller.form

import br.com.dmeireles.restapplication.model.Item
import br.com.dmeireles.restapplication.model.ShoppingCart
import br.com.dmeireles.restapplication.service.ItemService
import br.com.dmeireles.restapplication.service.ProductService
import java.time.LocalDateTime

class CreateShoppingCartForm(
        val items: List<CreateItemForm>
) {
    fun converter(
            itemService: ItemService,
            productService: ProductService
    ): ShoppingCart {
        val items: List<Item> = items.map { createItemForm: CreateItemForm ->
            itemService.save(createItemForm.converter(productService))
        }
        val now: LocalDateTime = LocalDateTime.now()
        return ShoppingCart(
                items = items,
                creationDate = now,
                lastUpdateDate = now
        )
    }
}