package com.danielbohry.superus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SuperUsApplication

fun main(args: Array<String>) {
    runApplication<SuperUsApplication>(*args)
}
