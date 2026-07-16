package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();

        Pattern fn = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = fn.matcher(firstName);

        System.out.println(m.matches());
    }
}
