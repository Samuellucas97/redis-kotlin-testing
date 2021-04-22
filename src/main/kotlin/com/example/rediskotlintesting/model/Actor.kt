package com.example.rediskotlintesting.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.index.Indexed
import java.time.LocalDate
import java.time.LocalDateTime

@RedisHash("Actors")
data class Actor(
    @Indexed
    var firstName: String,
    var secondName: String,
    var birthday: LocalDate
) {
    @get:Id
    val id: String? = null
}