package com.learn.micronaut.api.requests

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
class CreateBookRequest(
    @field:NotBlank
    val title: String,

    @field:NotBlank
    val numOfPages: Int,

    @field:NotBlank
    val author: String,

    @field:NotBlank
    val isbn: String,

    @field:NotBlank
    val yearPublished: Int
)