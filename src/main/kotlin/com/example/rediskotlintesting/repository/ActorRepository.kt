package com.example.rediskotlintesting.repository

import com.example.rediskotlintesting.model.Actor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ActorRepository: CrudRepository<Actor, String>