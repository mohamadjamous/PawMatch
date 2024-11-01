package com.example.pawmatch.data

import com.example.pawmatch.R
import com.example.pawmatch.model.Pet
import com.example.pawmatch.model.PetOwner

object DemoDatabase {
    val owner = PetOwner("Spikey Sanju", "Developer & Pet Lover", R.drawable.owner)
    val dogList = listOf(
        Pet(
            0,
            "Charlie",
            2.5,
            "Male",
            "Golden",
            13.2,
            "400m away",
            R.drawable.orange_dog, // You can change the drawable resource as needed
            "Charlie is a playful golden retriever who loves to fetch and enjoys long walks in the park.",
            owner
        ),
        Pet(
            1,
            "Bella",
            4.0,
            "Female",
            "Sable",
            11.8,
            "300m away",
            R.drawable.blue_dog,
            "Bella is a charming Cocker Spaniel with a friendly disposition, always ready to cuddle.",
            owner
        ),
        Pet(
            2,
            "Max",
            3.0,
            "Male",
            "White",
            10.5,
            "650m away",
            R.drawable.red_dog,
            "Max is an adventurous husky who loves exploring the outdoors and meeting new friends.",
            owner
        ),
        Pet(
            3,
            "Luna",
            1.5,
            "Female",
            "Black & Tan",
            7.8,
            "800m away",
            R.drawable.yellow_dog,
            "Luna is a lively Beagle who enjoys playing hide and seek and chasing butterflies.",
            owner
        ),
        Pet(
            4,
            "Rocky",
            5.0,
            "Male",
            "Brindle",
            15.3,
            "1200m away",
            R.drawable.white_dog,
            "Rocky is a gentle giant who loves lounging around and being the center of attention.",
            owner
        )
    )
}

