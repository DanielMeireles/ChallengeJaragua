package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.ShoppingCart
import org.springframework.data.jpa.repository.JpaRepository

interface ShoppingCartRepository: JpaRepository<ShoppingCart, Long>