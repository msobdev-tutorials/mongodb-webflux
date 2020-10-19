package com.msobdev.kata.mongodbwebflux.infrastructure.rest.user;

import com.msobdev.kata.mongodbwebflux.application.user.User;
import com.msobdev.kata.mongodbwebflux.application.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping(path = "/api")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/v1/user")
    public Mono<User> addUser(@RequestBody User user) {
        log.info("addUser: {}", user.getName());
        return userService.save(user);
    }

    @GetMapping(path = "v1/user")
    public Flux<User> getAllUsers() {
        log.info("getUsers");
        return userService.getAll();
    }
}
