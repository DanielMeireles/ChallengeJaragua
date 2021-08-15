package br.com.dmeireles.restapplication.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class ShoppingCart(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
        @ManyToMany val items: List<Item>? = null,
        @Column(name = "creation_date") val creationDate: LocalDateTime? = null,
        @Column(name = "last_update_date") val lastUpdateDate: LocalDateTime? = null,
)