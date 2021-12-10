package com.learn.micronaut.service

import com.learn.micronaut.api.requests.CreateBookRequest
import com.learn.micronaut.entity.Book
import com.learn.micronaut.repository.BookRepository
import jakarta.inject.Singleton

@Singleton
class BookService(private val repository: BookRepository) {

    fun getBooks(): Iterable<Book> = repository.findAll()

    fun createBook(createBookRequest: CreateBookRequest): Book {
        val book = Book(
            createBookRequest.title,
            createBookRequest.numOfPages,
            createBookRequest.author,
            createBookRequest.isbn,
            createBookRequest.yearPublished
        )
        return repository.save(book)
    }
}