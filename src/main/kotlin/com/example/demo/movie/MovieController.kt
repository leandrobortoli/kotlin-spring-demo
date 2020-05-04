package com.example.demo.movie

import com.example.demo.abstract.CrudController
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/movies")
class MovieController(private var movieService: MovieService) : CrudController<Movie, Long>(movieService){
}