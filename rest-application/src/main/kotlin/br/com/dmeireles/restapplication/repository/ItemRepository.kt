package br.com.dmeireles.restapplication.repository

import br.com.dmeireles.restapplication.model.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository: JpaRepository<Item, Long>