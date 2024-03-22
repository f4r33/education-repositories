package com.example.demo

import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController {
    private val items = mutableListOf("Apple", "Banana", "Carrot")

    // TODO: Create a GET endpoint that returns a list of items in JSON format.
    // Expected result: A request to "/items" should return a JSON array of items.
}
