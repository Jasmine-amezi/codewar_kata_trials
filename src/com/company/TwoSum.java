package com.company;


public class TwoSum {
    public static int[] twoSum(int [] numbers, int target){
        for(int i = 0; i<=numbers.length-1;i++){
            if(numbers[i] + numbers[i+1] == target){
                System.out.println("index"+ i + ".......and index"+ (i+1));
            }
        }

        return null;
    }
}
