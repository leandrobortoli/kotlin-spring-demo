package com.example.demo.abstract

import org.springframework.data.jpa.repository.JpaRepository

abstract class CrudService<T, ID>(private var repository: JpaRepository<T, ID>) {

    fun get(id: ID): T {
        return repository.getOne(id)
    }

    fun get(): List<T> {
        return repository.findAll()
    }

    fun post(entity: T): T {
        return repository.save(entity)
    }

    fun delete(id: ID) {
        repository.deleteById(id)
    }
}