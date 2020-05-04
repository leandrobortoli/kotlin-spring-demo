package com.example.demo.movietheater

import com.example.demo.abstract.CrudController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("movie-theaters")
class MovieTheaterController(private var movieTheaterService: MovieTheaterService) : CrudController<MovieTheater, Long>(movieTheaterService)