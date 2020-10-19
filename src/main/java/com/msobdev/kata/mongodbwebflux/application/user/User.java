package com.msobdev.kata.mongodbwebflux.application.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private String login;
    private String role;
}
