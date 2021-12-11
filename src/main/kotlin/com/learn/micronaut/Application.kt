package com.learn.micronaut

import io.micronaut.runtime.Micronaut.build
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License

@OpenAPIDefinition(
    info = Info(
        title = "Learn Micronaut API",
        version = "0.0",
        description = "Learning Micronaut through building an API",
        license = License(name = "Apache 2.0")
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

