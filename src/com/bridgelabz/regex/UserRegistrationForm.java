package com.bridgelabz.regex;

import java.util.regex.Pattern;

// Functional Interface
@FunctionalInterface
interface UserValidator {
    boolean validate(String input) throws UserRegistrationException;
}

// Custom Exception Class
class UserRegistrationException extends Exception {
    public UserRegistrationException(String message) {
        super(message);
    }
}

class ValidateUserRegistration {

    // Lambda to validate First Name if invalid throw exception
    UserValidator firstNameValidator = firstName -> {
        if (!Pattern.matches("^[A-Z][a-z]{3,}$", firstName)) {
            throw new UserRegistrationException("Invalid First Name");
        }
        return true;
    };

    //Lambda to  validate LastName if invalid throw exception
    UserValidator lastNameValidator = lastName -> {
        if (!Pattern.matches("^[A-Z][a-z]{3,}$", lastName)) {
            throw new UserRegistrationException("Invalid Last Name");
        }
        return true;
    };

    //Lambda to  validate Email if invalid throw exception
    UserValidator emailValidator = email -> {
        if (!Pattern.matches("^[A-Za-z0-9_.+-]+@[A-Za-z0-9_.-]+\\.[a-z]{2,}$", email)) {
            throw new UserRegistrationException("Invalid Email");
        }
        return true;
    };

    //Lambda to  validate Mobile if invalid throw exception
    UserValidator mobileValidator = mobile -> {
        if (!Pattern.matches("^91\\s[6-9][0-9]{9}$", mobile)) {
            throw new UserRegistrationException("Invalid Mobile Number");
        }
        return true;
    };

    //Lambda to  validate Password if invalid throw exception
    UserValidator passwordValidator = password -> {
        if (!Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$&*+]).{8,}$", password)) {
            throw new UserRegistrationException("Invalid Password");
        }
        return true;
    };
}
