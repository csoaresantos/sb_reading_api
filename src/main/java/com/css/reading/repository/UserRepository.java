package com.css.reading.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.css.reading.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
