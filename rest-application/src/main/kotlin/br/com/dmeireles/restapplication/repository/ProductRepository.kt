package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface ProductRepository: JpaRepository<Product, Long> {
    fun findAllByLastUpdateDateBetween(
            startDate: LocalDateTime,
            endDate: LocalDateTime
    ): List<Product>?
}