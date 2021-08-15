package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Address
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface AddressRepository: JpaRepository<Address, Long> {
    fun findAllByLastUpdateDateBetween(
            startDate: LocalDateTime,
            endDate: LocalDateTime
    ): List<Address>?
}