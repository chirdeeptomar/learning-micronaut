package com.learn.micronaut.service

import com.learn.micronaut.api.requests.CreateBookRequest
import com.learn.micronaut.entity.Book
import com.learn.micronaut.repository.BookRepository
import jakarta.inject.Singleton
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Singleton
class BookService(private val repository: BookRepository) {

    suspend fun getBooks(): Iterable<Book> {
        println("Service Running on: ${Thread.currentThread().name}")

        return withContext(Dispatchers.IO) {
            println("Repository Running on: ${Thread.currentThread().name}")
            repository.findAll()
        }
    }

    suspend fun createBook(createBookRequest: CreateBookRequest): Book {
        val book = Book(
            createBookRequest.title,
            createBookRequest.numOfPages,
            createBookRequest.author,
            createBookRequest.isbn,
            createBookRequest.yearPublished
        )

        return withContext(Dispatchers.IO) {
            repository.save(book)
        }
    }
}