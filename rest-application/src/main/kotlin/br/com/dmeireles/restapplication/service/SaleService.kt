package br.com.dmeireles.restapplication.service

import br.com.dmeireles.restapplication.model.Sale
import br.com.dmeireles.restapplication.repository.SaleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class SaleService {
    @Autowired
    private lateinit var saleRepository: SaleRepository
    fun save(sale: Sale): Sale = saleRepository.save(sale)
    fun getById(id: Long): Sale = saleRepository.getById(id)
}