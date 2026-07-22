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
        assertThrows(UserRegistrationException.class,
                () -> validator.firstNameValidator.validate("An"));
    }

    // Test Invalid Last Name to check whether exception is thrown    @Test
    @Test
    void invalidLastName() {
        assertThrows(UserRegistrationException.class,
                () -> validator.lastNameValidator.validate("gi"));
    }

    // Test Invalid email to check whether exception is thrown    @Test
    @Test
    void invalidEmail() {
        assertThrows(UserRegistrationException.class,
                () -> validator.emailValidator.validate("angel@"));
    }

    // Test Invalid mobile to check whether exception is thrown    @Test
    @Test
    void invalidMobile() {
        assertThrows(UserRegistrationException.class,
                () -> validator.mobileValidator.validate("9876543210"));
    }

    // Test Invalid password to check whether exception is thrown    @Test
    @Test
    void invalidPassword() {
        assertThrows(UserRegistrationException.class,
                () -> validator.passwordValidator.validate("angel@"));
    }
}
