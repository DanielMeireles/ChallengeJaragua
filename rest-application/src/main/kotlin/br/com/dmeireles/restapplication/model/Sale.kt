package br.com.dmeireles.restapplication.model

import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Sale(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
        val date: LocalDate? = null,
        @OneToOne val client: Client? = null,
        @OneToOne val shoppingCart: ShoppingCart? = null,
        val discount: BigDecimal? = null,
        @Column(name = "creation_date") val creationDate: LocalDateTime? = null,
        @Column(name = "last_update_date") val lastUpdateDate: LocalDateTime? = null,
)