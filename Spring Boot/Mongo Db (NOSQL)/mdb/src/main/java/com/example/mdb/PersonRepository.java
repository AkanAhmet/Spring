package com.example.mdb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person,Long> {
    List<Person> findByName(String name);

    List<Person> findByNameLike(String name);


}
