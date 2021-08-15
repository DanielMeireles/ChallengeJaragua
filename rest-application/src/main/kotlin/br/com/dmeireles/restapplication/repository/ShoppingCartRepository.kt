package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.ShoppingCart
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface ShoppingCartRepository: JpaRepository<ShoppingCart, Long> {
    fun findAllByLastUpdateDateBetween(
            startDate: LocalDateTime,
            endDate: LocalDateTime
    ): List<ShoppingCart>?
}