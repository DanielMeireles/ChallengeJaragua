package br.com.dmeireles.restapplication.model

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Client(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
        val name: String? = null,
        val birthdate: LocalDate? = null,
        val email: String? = null,
        val cpf: String? = null,
        @OneToOne val address: Address? = null,
        @Column(name = "creation_date") val creationDate: LocalDateTime? = null,
        @Column(name = "last_update_date") val lastUpdateDate: LocalDateTime? = null,
)