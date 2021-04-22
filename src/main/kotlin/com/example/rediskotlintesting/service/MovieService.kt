package com.example.rediskotlintesting.service

import com.example.rediskotlintesting.dto.MovieDTO
import com.example.rediskotlintesting.model.Movie

interface MovieService {
    fun getMovie(id: String) : Movie
    fun getAllMovies() : List<Movie>
    fun updateMovie(id: String, movieDTO: MovieDTO) : Movie
    fun createMovie(movieDTO: MovieDTO) : Movie
    fun deleteMovie(id: String)
}