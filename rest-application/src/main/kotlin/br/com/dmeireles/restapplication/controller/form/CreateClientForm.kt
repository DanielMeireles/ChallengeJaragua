package br.com.dmeireles.restapplication.controller.form

import br.com.dmeireles.restapplication.model.Address
import br.com.dmeireles.restapplication.model.Client
import java.time.LocalDate
import java.time.LocalDateTime

class CreateClientForm(
        private val name: String,
        private val birthdate: LocalDate,
        private val email: String,
        private val cpf: String,
        val address: CreateAddressForm
){
    fun converter(address: Address): Client {
        val now: LocalDateTime = LocalDateTime.now()
        return Client(
                name = name,
                birthdate = birthdate,
                email = email,
                cpf = cpf,
                address = address,
                creationDate = now,
                lastUpdateDate = now
        )
    }
}