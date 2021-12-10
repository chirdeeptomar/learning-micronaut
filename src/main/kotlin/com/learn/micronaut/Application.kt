package com.learn.micronaut

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
        info = Info(
                title = "learn-micronaut",
                version = "0.0"
        )
)
object Api {
}

fun main(args: Array<String>) {
    build()
            .args(*args)
            .packages("com.learn.micronaut")
            .start()
}

