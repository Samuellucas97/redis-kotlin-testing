package com.example.rediskotlintesting.service

import com.example.rediskotlintesting.dto.MovieDTO
import com.example.rediskotlintesting.model.Movie
import com.example.rediskotlintesting.repository.MovieRepository
import org.springframework.stereotype.Service

@Service
class DefaultMovieService (
    val movieRepository: MovieRepository
) : MovieService {
    override fun getMovie(id: String): Movie = movieRepository.findById(id).get()


    override fun getAllMovies(): List<Movie> {
//        movieRepository.findAll()
//        =
        TODO("Not yet implemented")
    }
    override fun updateMovie(id: String, movieDTO: MovieDTO): Movie {
        val movie = movieRepository.existsById(id)
        movieRepository.save()
    }

    override fun createMovie(movieDTO: MovieDTO): Movie {
        TODO("Not yet implemented")
    }

    override fun deleteMovie(id: String) {
        TODO("Not yet implemented")
    }
}