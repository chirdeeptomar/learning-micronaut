package com.learn.micronaut.entity

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.util.*

@MappedEntity("books")
data class Book(
    val title: String,
    val numOfPages: Int,
    val author: String,
    val isbn: String,
    val yearPublished: Int,
    @field:Id val id: UUID? = UUID.randomUUID(),
)

