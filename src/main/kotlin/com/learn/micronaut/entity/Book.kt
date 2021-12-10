package com.learn.micronaut.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Book(
    val title: String,
    val numOfPages: Int,
    val author: String,
    val isbn: String,
    val yearPublished: Int,
    @Id @GeneratedValue val id: UUID? = null,
)

