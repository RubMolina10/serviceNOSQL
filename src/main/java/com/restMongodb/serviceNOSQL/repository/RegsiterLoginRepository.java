package com.restMongodb.serviceNOSQL.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.restMongodb.serviceNOSQL.model.Register;

public interface RegsiterLoginRepository extends MongoRepository<Register, String> {
   
    
}
