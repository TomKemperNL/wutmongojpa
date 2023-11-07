package com.example.wutmongojpa;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MongoEntity
{
    private ObjectId id;

    private String label;

    public MongoEntity(String label) {
        this.label = label;
    }

    public ObjectId getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }
}
