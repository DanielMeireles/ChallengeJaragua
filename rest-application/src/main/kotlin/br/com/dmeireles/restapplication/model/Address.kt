package br.com.dmeireles.restapplication.model

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Address(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
        val street: String? = null,
        val number: String? = null,
        val complement: String? = null,
        val city: String? = null,
        val state: String? = null,
        val country: String? = null,
        @Column(name = "zip_code") val zipCode: String? = null,
        @Column(name = "creation_date") val creationDate: LocalDateTime? = null,
        @Column(name = "last_update_date") val lastUpdateDate: LocalDateTime? = null,
)