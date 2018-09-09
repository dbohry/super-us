package com.danielbohry.superus.services

import com.danielbohry.superus.entities.Cart
import com.danielbohry.superus.repositories.CartRepository
import javassist.NotFoundException
import org.springframework.stereotype.Service

@Service
class CartService(val repo: CartRepository) {

    fun getAll() = repo.findAll()

    fun getById(id: String) = repo.findById(id)

    fun save(cart: Cart) = repo.save(cart)

    fun update(id: String, cart: Cart): Cart {
        repo.findById(id).orElseThrow { NotFoundException("ID $id not found") }
        return repo.save(cart)
    }

}