package com.msobdev.kata.mongodbwebflux.application.user;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> save(User user);

    Flux<User> getAll();

}
