package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Sale
import org.springframework.data.jpa.repository.JpaRepository

interface SaleRepository: JpaRepository<Sale, Long>