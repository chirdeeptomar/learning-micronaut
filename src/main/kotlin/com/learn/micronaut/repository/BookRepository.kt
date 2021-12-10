package com.learn.micronaut.repository

import com.learn.micronaut.entity.Book
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.repository.PageableRepository
import java.util.*

@JdbcRepository
interface BookRepository : PageableRepository<Book, UUID>