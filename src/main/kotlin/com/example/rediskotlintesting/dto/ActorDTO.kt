package com.example.rediskotlintesting.dto

import com.example.rediskotlintesting.model.Actor
import java.time.LocalDate
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Past

data class ActorDTO(
    @NotBlank var firstName: String,
    @NotBlank var secondName: String,
    @Min(1960) @Past var birthday: LocalDate
) {
    fun toDomain(actorDTO: ActorDTO) {
        var actor = Actor (
                        this.firstName,
                        this.secondName,
                        this.birthday,

                    )
    }
}