package com.msobdev.kata.mongodbwebflux.application.user;

import com.msobdev.kata.mongodbwebflux.infrastructure.persistence.user.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class DefaultUserServiceTest {

    private static UserRepository userRepository;
    private static UserService userService;

    @BeforeAll
    static void setUp() {
        userRepository = mock(UserRepository.class);
        userService = new DefaultUserService(userRepository);
    }

    @Test
    void getExistingUser() {
        // given


        // when


        // then

    }

    @Test
    void getNotFoundWhenUserNotExisting() {
        // given


        // when


        // then

    }
}
