package com.msobdev.kata.mongodbwebflux.infrastructure.persistence.user;

import com.msobdev.kata.mongodbwebflux.application.user.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, Long> {
}
