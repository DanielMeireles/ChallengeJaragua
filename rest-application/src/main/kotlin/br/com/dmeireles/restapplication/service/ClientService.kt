package br.com.dmeireles.restapplication.service

import br.com.dmeireles.restapplication.model.Client
import br.com.dmeireles.restapplication.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ClientService {
    @Autowired
    private lateinit var clientRepository: ClientRepository
    fun save(client: Client): Client = clientRepository.save(client)
    fun getById(id: Long): Client = clientRepository.getById(id)
}