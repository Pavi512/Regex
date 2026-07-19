package com.bridgelabz.regex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTest {

    ValidateUserRegistration validator;

    //Creates UserDetailsValidator object for each test case
    @BeforeEach
    void setUp() {
        validator = new ValidateUserRegistration();
    }

    //Test first name
    //Returns true
    @Test
    void validFirstName() {
        assertTrue(validator.validateFirstName("Angel"));
    }

    //Returns false
    @Test
    void invalidFirstName() {
        assertFalse(validator.validateFirstName("angel"));
    }

    //Test last name
    //Returns true
    @Test
    void validLastName() {
        assertTrue(validator.validateLastName("Girl"));
    }

    //Returns false
    @Test
    void invalidLastName() {
        assertFalse(validator.validateLastName("gl"));
    }

    //Test email
    //Returns true
    @Test
    void validEmail() {
        assertTrue(validator.validateEmail("angel.girl@gmail.com"));
    }

    //Returns false
    @Test
    void invalidEmail() {
        assertFalse(validator.validateEmail("angelgmail.com"));
    }

    //Test mobile number
    //Returns true
    @Test
    void validMobile() {
        assertTrue(validator.validateMobile("91 9876543210"));
    }

    //Returns false
    @Test
    void invalidMobile() {
        assertFalse(validator.validateMobile("9876543210"));
    }

    //Test password
    //Returns true
    @Test
    void validPassword() {
        assertTrue(validator.validatePassword("Angel@858"));
    }

    //Returns false
    @Test
    void invalidPassword() {
        assertFalse(validator.validatePassword("angel"));
    }
}

