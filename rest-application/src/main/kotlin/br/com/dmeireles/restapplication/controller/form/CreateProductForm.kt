package br.com.dmeireles.restapplication.controller.form

import br.com.dmeireles.restapplication.model.Product
import java.math.BigDecimal
import java.time.LocalDateTime

class CreateProductForm(
        private val name: String,
        private val description: String,
        private val value: BigDecimal
) {

    fun converter(): Product {
        val now: LocalDateTime = LocalDateTime.now()
        return Product(
                name = name,
                description = description,
                value = value,
                creationDate = now,
                lastUpdateDate = now
        )
    }

}