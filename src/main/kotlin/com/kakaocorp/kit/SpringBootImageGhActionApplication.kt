package com.kakaocorp.kit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringBootImageGhActionApplication

fun main(args: Array<String>) {
    runApplication<SpringBootImageGhActionApplication>(*args)
}

@RestController
class IndexController {
    @GetMapping
    fun index() = "hello"
}
