package br.com.dmeireles.restapplication.service

import br.com.dmeireles.restapplication.model.Item
import br.com.dmeireles.restapplication.repository.ItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ItemService {
    @Autowired
    private lateinit var itemRepository: ItemRepository
    fun save(item: Item): Item = itemRepository.save(item)
    fun getById(id: Long): Item = itemRepository.getById(id)
}