package br.com.dmeireles.restapplication.service

import br.com.dmeireles.restapplication.model.Product
import br.com.dmeireles.restapplication.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ProductService {
    @Autowired
    private lateinit var productRepository: ProductRepository
    fun save(product: Product): Product = productRepository.save(product)
    fun getById(id: Long): Product = productRepository.getById(id)
}