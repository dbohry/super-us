package com.danielbohry.superus.repositories

import com.danielbohry.superus.entities.Cart
import org.springframework.data.repository.CrudRepository

interface CartRepository : CrudRepository<Cart, String>