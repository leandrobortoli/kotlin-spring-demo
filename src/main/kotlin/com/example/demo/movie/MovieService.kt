package com.example.demo.movie

import com.example.demo.abstract.CrudService
import org.springframework.stereotype.Service

@Service
class MovieService(private var repository: MovieRepository) : CrudService<Movie, Long>(repository) {
}
