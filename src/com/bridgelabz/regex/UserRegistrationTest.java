package com.bridgelabz.regex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    ValidateUserRegistration validator;

    //Creates UserDetailsValidator object for each test case
    @BeforeEach
    void setUp() {
        validator = new ValidateUserRegistration();
    }

    // Test Invalid First Name to check whether exception is thrown    @Test
    @Test
    void invalidFirstName() {
        UserRegistrationException exception =
                assertThrows(UserRegistrationException.class,
                        () -> validator.validateFirstName("An"));
    }

    // Test Invalid Last Name to check whether exception is thrown    @Test
    @Test
    void invalidLastName() {
        UserRegistrationException exception =
                assertThrows(UserRegistrationException.class,
                        () -> validator.validateFirstName("gi"));
    }

    // Test Invalid email to check whether exception is thrown    @Test
    @Test
    void invalidEmail() {
        UserRegistrationException exception =
                assertThrows(UserRegistrationException.class,
                        () -> validator.validateEmail("angel@"));
    }

    // Test Invalid mobile to check whether exception is thrown    @Test
    @Test
    void invalidMobile() {
        UserRegistrationException exception =
                assertThrows(UserRegistrationException.class,
                        () -> validator.validateMobile("9876543210"));
    }

    // Test Invalid password to check whether exception is thrown    @Test
    @Test
    void invalidPassword() {
        UserRegistrationException exception =
                assertThrows(UserRegistrationException.class,
                        () -> validator.validatePassword("angel@"));
    }
}
