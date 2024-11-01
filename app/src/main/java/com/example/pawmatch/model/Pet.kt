
package com.example.pawmatch.model

data class Pet(
    val id: Int,
    val name: String,
    val age: Double,
    val gender: String,
    val color: String,
    val weight: Double,
    val location: String,
    val image: Int,
    val about: String,
    val owner: PetOwner
)
