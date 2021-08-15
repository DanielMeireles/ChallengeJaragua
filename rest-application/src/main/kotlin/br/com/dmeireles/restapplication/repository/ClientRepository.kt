package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Long>