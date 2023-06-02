package com.example.demo.registration;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    //When client sends request, want to capture:
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
