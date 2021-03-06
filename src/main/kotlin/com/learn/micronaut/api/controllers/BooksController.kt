package com.learn.micronaut.api.controllers

import com.learn.micronaut.api.requests.CreateBookRequest
import com.learn.micronaut.entity.Book
import com.learn.micronaut.service.BookService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import javax.validation.Valid

@Controller("/api/v1/books")
open class BooksController(private val service: BookService) {

    @Get("/")
    suspend fun getBooks(): Iterable<Book> {
        println("Controller Running on: ${Thread.currentThread().name}")
        return service.getBooks()
    }

    @Post("/")
    open suspend fun createBook(@Valid @Body createBookRequest: CreateBookRequest): HttpResponse<Book>? {
        val book = service.createBook(createBookRequest)
        return HttpResponse.created(book)
    }
}