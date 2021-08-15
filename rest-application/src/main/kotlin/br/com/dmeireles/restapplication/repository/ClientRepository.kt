package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface ClientRepository: JpaRepository<Client, Long> {
    fun findAllByLastUpdateDateBetween(
            startDate: LocalDateTime,
            endDate: LocalDateTime
    ): List<Client>?
}