package com.danielbohry.superus.controllers

import com.danielbohry.superus.services.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/products")
class ProductController(val service: ProductService) {

    @GetMapping
    fun getAll() = service.getAll()

}