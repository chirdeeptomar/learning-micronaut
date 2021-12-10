package com.learn.micronaut.repository

import com.learn.micronaut.entity.Book
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.PageableRepository
import java.util.*

@Repository
interface BookRepository : PageableRepository<Book, UUID>