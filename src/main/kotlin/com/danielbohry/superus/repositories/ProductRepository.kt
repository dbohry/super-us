package com.danielbohry.superus.repositories

import com.danielbohry.superus.entities.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, String>