package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking user input
        String email = sc.nextLine();

        //Regex to validate email
        Pattern fn = Pattern.compile("^[A-Za-z0-9_.-]+@[A-Za-z_.-]+\\.[a-z]{2,}$");

        //Matcher to check whether the email is matches with the regex
        Matcher m = fn.matcher(email);

        //Prints true if matches otherwise false
        System.out.println(m.matches());
    }
}
