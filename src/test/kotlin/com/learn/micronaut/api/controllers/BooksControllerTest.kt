package com.learn.micronaut.api.controllers

import com.learn.micronaut.api.requests.CreateBookRequest
import com.learn.micronaut.entity.Book
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.shouldBe
import io.micronaut.http.HttpRequest.GET
import io.micronaut.http.HttpRequest.POST
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.kotlin.http.retrieveList
import io.micronaut.test.extensions.kotest.annotation.MicronautTest

@MicronautTest
class BooksControllerTest(@Client("/") private val httpClient: HttpClient) : StringSpec({

    val client = httpClient.toBlocking()

    "Add a book" {
        val request = CreateBookRequest(
            "Test Book",
            12,
            "Test",
            "8312083jJjljlk",
            2021
        )
        val response = client.exchange(POST("/api/v1/books", request), CreateBookRequest::class.java)
        response.status shouldBe HttpStatus.CREATED
    }


    "Get all books" {
        val response = client.retrieveList<Book>(GET("/api/v1/books"))
        response.size shouldBeExactly 1
    }
})

