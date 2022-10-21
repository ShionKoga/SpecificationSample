package com.example.specificationplayground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/item")
class Controller(private val itemService: ItemService) {
    @GetMapping
    fun searchItems(
        @RequestParam color: String?,
        @RequestParam grade: String?,
        @RequestParam name: String?,
    ): List<Item> {
        return itemService.searchItems(
            SearchItemsArgument(
                color,
                grade,
                name
            )
        )
    }
}