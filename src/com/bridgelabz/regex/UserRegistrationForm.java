package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking user input
        String password = sc.nextLine();

        //Regex to validate password
        Pattern fn = Pattern.compile("^(?=.*[A-Z])+(?=.*[a-z])+(?=.*[0-9])+(?=.*[@#$&*+]).{8,}$");

        //Matcher to check whether the password is matches with the regex
        Matcher m = fn.matcher(password);

        //Prints true if matches otherwise false
        System.out.println(m.matches());
    }
}
