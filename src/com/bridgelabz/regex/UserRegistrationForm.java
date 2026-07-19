package com.bridgelabz.regex;

import java.util.regex.Pattern;

class ValidateUserRegistration {
    //To validate FirstName
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-z]{3,}$", firstName);
    }

    //To validate LastName
    public boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z][a-z]{3,}$", lastName);
    }

    //To validate Email
    public boolean validateEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9_.+-]+@[A-Za-z0-9_.-]+\\.[a-z]{2,}$", email);
    }

    //To validate Mobile
    public boolean validateMobile(String mobile) {
        return Pattern.matches("^91\\s[6-9][0-9]{9}$", mobile);
    }

    //To validate Password
    public boolean validatePassword(String password) {
        return Pattern.matches("^(?=.*[A-Z])+(?=.*[a-z])+(?=.*[0-9])+(?=.*[@#$&*+]).{8,}$", password);
    }
}
