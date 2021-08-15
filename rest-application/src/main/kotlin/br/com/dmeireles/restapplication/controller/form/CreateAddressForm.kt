package br.com.dmeireles.restapplication.controller.form

import br.com.dmeireles.restapplication.model.Address
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class CreateAddressForm(
        private val street: String,
        private val number: String,
        private val complement: String,
        private val city: String,
        private val state: String,
        private val country: String,
        @JsonProperty("zip_code") private val zipCode: String
) {
    fun converter(): Address {
        val now: LocalDateTime = LocalDateTime.now()
        return Address(
                street = street,
                number = number,
                complement = complement,
                city = city,
                state = state,
                country = country,
                zipCode = zipCode,
                creationDate = now,
                lastUpdateDate = now
        )
    }

}