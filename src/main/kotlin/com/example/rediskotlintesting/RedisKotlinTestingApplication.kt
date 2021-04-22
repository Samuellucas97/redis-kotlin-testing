package com.example.rediskotlintesting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RedisKotlinTestingApplication

fun main(args: Array<String>) {
	runApplication<RedisKotlinTestingApplication>(*args)
}
