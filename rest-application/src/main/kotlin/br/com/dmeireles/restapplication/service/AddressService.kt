package br.com.dmeireles.restapplication.service

import br.com.dmeireles.restapplication.model.Address
import br.com.dmeireles.restapplication.repository.AddressRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class AddressService {

    @Autowired
    private lateinit var addressRepository: AddressRepository

    fun save(address: Address): Address = addressRepository.save(address)
    fun getById(id: Long): Address = addressRepository.getById(id)
}