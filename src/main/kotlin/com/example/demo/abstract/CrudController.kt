package com.example.demo.abstract

import org.springframework.web.bind.annotation.*

abstract class CrudController<T, ID>(private var service: CrudService<T, ID>) {

    @GetMapping
    fun get(): List<T> {
        return service.get()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable id: ID): T {
        return service.get(id)
    }

    @PostMapping
    fun post(@RequestBody entity: T): T {
        return service.post(entity)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: ID) {
        service.delete(id)
    }
}