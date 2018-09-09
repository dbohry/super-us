package com.danielbohry.superus.entities

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "products")
class Product {

    var name: String? = null
    var quantity: Int = 1

}