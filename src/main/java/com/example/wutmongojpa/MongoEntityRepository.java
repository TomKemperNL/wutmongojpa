package com.example.wutmongojpa;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoEntityRepository extends MongoRepository<MongoEntity, ObjectId> {
}
