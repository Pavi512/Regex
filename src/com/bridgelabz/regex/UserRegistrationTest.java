package com.bridgelabz.regex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    //Parameterized test for valid emails
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    void validEmails(String email) {
        assertTrue(validator.validateEmail(email));
    }

    //Parameterized test for invalid emails
    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@",
            "@gmail.com",
            "abc@gmail",
            "abc@gmail.",
            "abc@.com"
    })
    void givenInvalidEmails_ReturnFalse(String email) {
        assertFalse(validator.validateEmail(email));
    }

}

