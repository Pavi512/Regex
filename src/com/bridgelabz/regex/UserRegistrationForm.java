package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking user input
        String lastName = sc.nextLine();

        //Regex to validate last name
        Pattern fn = Pattern.compile("^[A-Z][a-z]{2,}$");

        //Matcher to check whether the last name is matches with the regex
        Matcher m = fn.matcher(lastName);

        //Prints true if matches otherwise false
        System.out.println(m.matches());
    }
}
