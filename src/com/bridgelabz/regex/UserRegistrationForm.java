package com.bridgelabz.regex;

import java.util.regex.Pattern;

// Custom Exception Class
class UserRegistrationException extends Exception {
    public UserRegistrationException(String message) {
        super(message);
    }
}

class ValidateUserRegistration {

    //To validate FirstName if invalid throw exception
    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        if (!Pattern.matches("^[A-Z][a-z]{3,}$", firstName)) {
            throw new UserRegistrationException("Invalid First Name");
        }
        return true;
    }

    //To validate LastName if invalid throw exception
    public boolean validateLastName(String lastName) throws UserRegistrationException {
        if (!Pattern.matches("^[A-Z][a-z]{3,}$", lastName)) {
            throw new UserRegistrationException("Invalid Last Name");
        }
        return true;
    }

    //To validate Email if invalid throw exception
    public boolean validateEmail(String email) throws UserRegistrationException {
        if (!Pattern.matches("^[A-Za-z0-9_.+-]+@[A-Za-z0-9_.-]+\\.[a-z]{2,}$", email)) {
            throw new UserRegistrationException("Invalid Email");
        }
        return true;
    }

    //To validate Mobile if invalid throw exception
    public boolean validateMobile(String mobile) throws UserRegistrationException {
        if (!Pattern.matches("^91\\s[6-9][0-9]{9}$", mobile)) {
            throw new UserRegistrationException("Invalid Mobile Number");
        }
        return true;
    }

    //To validate Password if invalid throw exception
    public boolean validatePassword(String password) throws UserRegistrationException {
        if (!Pattern.matches("^(?=.*[A-Z])+(?=.*[a-z])+(?=.*[0-9])+(?=.*[@#$&*+]).{8,}$", password)) {
            throw new UserRegistrationException("Invalid Password");
        }
        return true;
    }
}
