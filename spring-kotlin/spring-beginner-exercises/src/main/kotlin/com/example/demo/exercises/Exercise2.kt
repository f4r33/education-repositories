package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    // TODO: Modify the method below to accept a name as a path variable
    // and return a greeting message that includes the name.
    // Expected result: Navigating to "/greeting/John" should return "Hello, John!"
    fun greet(): String {
        return "Hello, $ name!"
    }
}