package br.com.dmeireles.restapplication.controller.dto

import br.com.dmeireles.restapplication.model.Client
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.LocalDateTime

class ClientDataDto(
    private val client: Client
){
    @JsonProperty("client_id") val clientId: Long? = client.id
    val name: String? = client.name
    val birthdate: LocalDate? = client.birthdate
    val email: String? = client.email
    val cpf: String? = client.cpf
    val address: AddressDataDto? = client.address?.let { AddressDataDto(it) }
    @JsonProperty("creation_date") val creationDate: LocalDateTime? = client.creationDate
    @JsonProperty("last_update_date") val lastUpdateDate: LocalDateTime? = client.lastUpdateDate
}