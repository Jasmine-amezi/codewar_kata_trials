/*
This code snippet has to do with string manipulation using most of the inbuilt functions in Java
 */


package com.company;
import java.util.Scanner;

public class AssignmentOne{
    public void firstMethod(){
        Scanner strObject = new Scanner(System.in);
        System.out.println("Please input a word with more than seven alphabets");
        String input = strObject.nextLine();
        int strLength = input.length();
        String upString = input.toUpperCase();
        String lowString = input.toLowerCase();

        System.out.println("This is the string : " + input);
        System.out.println("The length of the string is :  " + strLength);
        System.out.println("This is the string in lowercase : " + lowString);
        System.out.println("This is the string in uppercase : " + upString);
    }

}
