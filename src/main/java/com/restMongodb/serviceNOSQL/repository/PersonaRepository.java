package com.restMongodb.serviceNOSQL.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.restMongodb.serviceNOSQL.model.Persona;

public interface PersonaRepository extends MongoRepository<Persona, String> {
}
