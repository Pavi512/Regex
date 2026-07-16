package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking user input
        String mobileNum = sc.nextLine();

        //Regex to validate mobile number
        Pattern fn = Pattern.compile("^91\\s[6-9][0-9]{9,}$");

        //Matcher to check whether the mobile number is matches with the regex
        Matcher m = fn.matcher(mobileNum);

        //Prints true if matches otherwise false
        System.out.println(m.matches());
    }
}
