package com.danielbohry.superus.controllers

import com.danielbohry.superus.entities.Cart
import com.danielbohry.superus.services.CartService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/carts")
class CartController(val service: CartService) {

    @GetMapping
    fun getAll() =
            ResponseEntity.ok().body(service.getAll())

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: String) =
            ResponseEntity.ok().body(service.getById(id))

    @PostMapping
    fun save(@RequestBody cart: Cart) =
            ResponseEntity.status(HttpStatus.CREATED).body(service.save(cart))

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: String, @RequestBody cart: Cart ) =
            ResponseEntity.ok().body(service.update(id, cart))

}