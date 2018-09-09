package com.danielbohry.superus.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.util.*

@Document(collection = "carts")
class Cart {

    @Id
    var id: String? = null
    var date: LocalDate? = LocalDate.now()
    var products: List<Product>? = Collections.emptyList()

}