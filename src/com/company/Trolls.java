package com.company;
import java.util.regex.*;
import java.util.Scanner;

public class Trolls {
    public static String disemvowel(String my_string){
//        String newString = my_string.replaceAll("a|e|i|o|u|A|E|I|U|O", "");
        String newString = my_string.replaceAll("(?i)[aeiou]", "");

        System.out.println("This is the new string without vowels : " + newString);
        return newString;
    }
}
