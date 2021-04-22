package com.example.rediskotlintesting.service

import com.example.rediskotlintesting.dto.ActorDTO
import com.example.rediskotlintesting.model.Actor

interface ActorService {
    fun getActor(id: String) : Actor
    fun getAllActors() : List<Actor>
    fun updateActor(id: String, actorDTO: ActorDTO) : Actor
    fun createActor(actorDTO: ActorDTO) : Actor
    fun deleteActor(id: String)
}