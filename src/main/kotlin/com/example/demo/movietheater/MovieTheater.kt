package com.example.demo.movietheater

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "MOVIE_THEATER")
data class MovieTheater(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var name: String? = null,
        var address: String? = null,
        var rating: Double? = null
)