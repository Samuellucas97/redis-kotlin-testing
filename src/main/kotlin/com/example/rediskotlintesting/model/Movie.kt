package com.example.rediskotlintesting.model

import org.springframework.data.annotation.*
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.index.Indexed
import java.time.LocalDate
import java.time.LocalDateTime

@RedisHash("Movies")
data class Movie(
    @Indexed
    val title: String,
    val genre: String,
    val year: Int,
    val director: String
) {
    @get:Id
    var id: String? = null

    @Indexed
    @get:Reference
    val actors: List<Actor> = listOf()
}