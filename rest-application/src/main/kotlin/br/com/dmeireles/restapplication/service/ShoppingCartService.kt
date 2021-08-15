package br.com.dmeireles.restapplication.service

import br.com.dmeireles.restapplication.model.ShoppingCart
import br.com.dmeireles.restapplication.repository.ShoppingCartRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ShoppingCartService {
    @Autowired
    private lateinit var shoppingCartRepository: ShoppingCartRepository
    fun save(shoppingCart: ShoppingCart): ShoppingCart = shoppingCartRepository.save(shoppingCart)
    fun getById(id: Long): ShoppingCart = shoppingCartRepository.getById(id)
}