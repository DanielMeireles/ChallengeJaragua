package br.com.dmeireles.restapplication.controller.dto

import br.com.dmeireles.restapplication.model.Address
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class AddressDataDto(
        private val address: Address
) {
    @JsonProperty("address_id") val addressId: Long? = address.id
    val street: String? = address.street
    val number: String? = address.number
    val complement: String? = address.complement
    val city: String? = address.city
    val state: String? = address.state
    val country: String? = address.country
    @JsonProperty("zip_code") val zipCode: String? = address.zipCode
    @JsonProperty("creation_date") val creationDate: LocalDateTime? = address.creationDate
    @JsonProperty("last_update_date") val lastUpdateDate: LocalDateTime? = address.lastUpdateDate
}