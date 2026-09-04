package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun joy(): String {
        return "sad"
    }

}