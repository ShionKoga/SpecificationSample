package com.example.specificationplayground

import org.springframework.data.jpa.domain.Specification
import org.springframework.stereotype.Service

interface ItemService {
    fun searchItems(argument: SearchItemsArgument): List<Item>
}

@Service
class DefaultItemService(
    private val itemRepository: ItemRepository
): ItemService {
    override fun searchItems(argument: SearchItemsArgument): List<Item> {
        val specification = Specification
            .where(ItemSpecifications.colorEquals(argument.color))

        val records = itemRepository.findAll(specification)
        return records.map {
            Item(
                it.color,
                it.grade,
                it.name,
            )
        }
    }
}
