package com.danielbohry.superus.services

import com.danielbohry.superus.repositories.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService (val repository: ProductRepository) {

    fun getAll() = repository.findAll()

}