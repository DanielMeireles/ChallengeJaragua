package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Sale
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface SaleRepository: JpaRepository<Sale, Long> {
    fun findAllByLastUpdateDateBetween(
            startDate: LocalDateTime,
            endDate: LocalDateTime
    ): List<Sale>?
}