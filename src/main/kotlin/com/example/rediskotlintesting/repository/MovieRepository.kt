package com.example.rediskotlintesting.repository

import com.example.rediskotlintesting.model.Movie
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository: CrudRepository<Movie, String>