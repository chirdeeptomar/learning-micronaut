package com.learn.micronaut.api.requests

data class CreateBookRequest(
    val title: String,
    val numOfPages: Int,
    val author: String,
    val isbn: String,
    val yearPublished: Int
)