package br.com.dmeireles.restapplication.controller

import br.com.dmeireles.restapplication.controller.dto.ClientDataDto
import br.com.dmeireles.restapplication.controller.form.CreateClientForm
import br.com.dmeireles.restapplication.model.Address
import br.com.dmeireles.restapplication.model.Client
import br.com.dmeireles.restapplication.service.AddressService
import br.com.dmeireles.restapplication.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.transaction.Transactional

@RestController
@RequestMapping("/client")
class ClientController {

    @Autowired
    private lateinit var clientService: ClientService

    @Autowired
    private lateinit var addressService: AddressService

    @PostMapping
    @Transactional
    fun create(
            @RequestBody createClientForm: CreateClientForm,
            uriBuilder: UriComponentsBuilder
    ): ResponseEntity<ClientDataDto> {
        val address: Address = createClientForm.address.converter()
        val client: Client = createClientForm.converter(
                addressService.save(address)
        )
        clientService.save(client)
        val uri = uriBuilder.path("/client/{id}").buildAndExpand(client.id).toUri()
        return ResponseEntity.created(uri).body(ClientDataDto(client))
    }

}