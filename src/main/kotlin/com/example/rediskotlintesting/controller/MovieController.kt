package com.example.rediskotlintesting.controller

import com.example.rediskotlintesting.service.MovieService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/movies")
class MovieController(
    val movieService: MovieService
)
