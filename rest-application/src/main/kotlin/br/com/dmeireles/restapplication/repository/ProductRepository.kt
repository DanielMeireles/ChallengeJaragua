package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long>