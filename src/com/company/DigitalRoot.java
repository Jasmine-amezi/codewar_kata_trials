//Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
//
//        Examples
//        16  -->  1 + 6 = 7
//        942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
//        132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
//        493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2


package com.company;

public class DigitalRoot {
    public static int digital_root(int n) {
        String newValue = String.valueOf(n);
        String[] numbers = newValue.split("");
        int result=0;
        for (int i = 0; i<numbers.length; i++) {
            int N_numbers = Integer.parseInt(numbers[i]);
            result = result + N_numbers;
        }

        String S_result = String.valueOf(result);
        while(S_result.length() == 2){
            return digital_root(result);
        }

        System.out.println("The sum of the digits of the given integer is " + result);
        return result;
    }
}

