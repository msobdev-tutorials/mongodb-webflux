package com.msobdev.kata.mongodbwebflux.infrastructure;

import com.msobdev.kata.mongodbwebflux.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Application.class)
class UserIT {

    @Test
    void getExistingUser() {
        // given


        // when


        // then

    }

    @Test
    void get404WhenNotExistingUser() {
        // given


        // when


        // then

    }
}
