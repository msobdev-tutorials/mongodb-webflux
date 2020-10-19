package com.msobdev.kata.mongodbwebflux.application.user;

import com.msobdev.kata.mongodbwebflux.infrastructure.persistence.user.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DefaultUserService implements UserService {
    private UserRepository userRepository;

    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Flux<User> getAll() {
        return userRepository.findAll();
    }
}
