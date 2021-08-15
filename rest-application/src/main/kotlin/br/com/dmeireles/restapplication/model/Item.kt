package br.com.dmeireles.restapplication.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Item(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
        @ManyToOne @JoinColumn(name = "product_id") val product: Product? = null,
        val quantity: Int? = null,
        @Column(name = "creation_date") val creationDate: LocalDateTime? = null,
        @Column(name = "last_update_date") val lastUpdateDate: LocalDateTime? = null,
)