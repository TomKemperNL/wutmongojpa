package com.example.wutmongojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private MongoEntityRepository mongos;

    @Autowired
    private JpaEntityRepository jpas;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        mongos.insert(new MongoEntity("Hello Mongo!"));

        jpas.save(new JpaEntity("Hello JPA!"));
    }
}
