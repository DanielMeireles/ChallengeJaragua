package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository: JpaRepository<Address, Long>