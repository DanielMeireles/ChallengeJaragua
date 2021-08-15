package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Item
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface ItemRepository: JpaRepository<Item, Long> {
    fun findAllByLastUpdateDateBetween(
            startDate: LocalDateTime,
            endDate: LocalDateTime
    ): List<Item>?
}