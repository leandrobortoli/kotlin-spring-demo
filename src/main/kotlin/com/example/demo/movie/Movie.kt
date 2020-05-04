package com.example.demo.movie

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "MOVIE")
data class Movie(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var title: String? = null,
        var description: String? = null,
        var imdbRating: Double? = 0.0
)