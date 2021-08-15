package br.com.dmeireles.restapplication.model

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Product(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
        val name: String? = null,
        val description: String? = null,
        val value: BigDecimal? = null,
        @Column(name = "creation_date") val creationDate: LocalDateTime? = null,
        @Column(name = "last_update_date") val lastUpdateDate: LocalDateTime? = null,
)