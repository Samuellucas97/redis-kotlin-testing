package com.example.rediskotlintesting.dto

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.PastOrPresent


data class MovieDTO(
    @get:NotBlank val title: String,
    @get:NotBlank val genre: String,
    @Min(1980) @PastOrPresent val year: Int,
    @get:NotBlank val director: String
)