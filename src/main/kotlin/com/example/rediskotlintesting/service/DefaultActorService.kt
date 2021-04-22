package com.example.rediskotlintesting.service

import com.example.rediskotlintesting.dto.ActorDTO
import com.example.rediskotlintesting.model.Actor
import org.springframework.stereotype.Service

@Service
class DefaultActorService : ActorService {
    override fun getActor(id: String): Actor {
        TODO("Not yet implemented")
    }

    override fun getAllActors(): List<Actor> {
        TODO("Not yet implemented")
    }

    override fun updateActor(id: String, actorDTO: ActorDTO): Actor {
        TODO("Not yet implemented")
    }

    override fun createActor(actorDTO: ActorDTO): Actor {
        TODO("Not yet implemented")
    }

    override fun deleteActor(id: String) {
        TODO("Not yet implemented")
    }
}