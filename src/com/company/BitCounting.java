package com.company;

public class BitCounting {
    public static int countBits(int n){
        String val = Integer.toBinaryString(n);
        int counter = 0;
        for (int i=0; i<=val.length()-1;i++){
            if(val.charAt(i)== '1'){
                counter++;
            }
        }
        System.out.println("This is the number of bits equal to one : " + counter);
        return counter;
    }
}
