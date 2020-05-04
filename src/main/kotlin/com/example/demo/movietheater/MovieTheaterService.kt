package com.example.demo.movietheater

import com.example.demo.abstract.CrudService
import org.springframework.stereotype.Service

@Service
class MovieTheaterService(private var repository: MovieTheaterRepository) : CrudService<MovieTheater, Long>(repository)