package com.example.demo.movietheater

import org.springframework.data.jpa.repository.JpaRepository

interface MovieTheaterRepository : JpaRepository<MovieTheater, Long>