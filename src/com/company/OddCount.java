//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//
//        Examples
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

//Employing the usage of a hashmap

package com.company;
import java.util.HashMap;
import java.util.Map;

public class OddCount {
    public static int findIt(int[] arr) {
        int result = 0;
        //declared a hashmap and stored elements of the array as a key
        // and the number of times they occurred as a value

        HashMap<Integer, Integer> firstHashmap = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++) {
            if (firstHashmap.get(arr[i]) == null) {
                firstHashmap.put(arr[i], 1);
            } else {
                int count = firstHashmap.get(arr[i]);
                count++;
                firstHashmap.put(arr[i], count);
            }
        }
        for (Map.Entry<Integer, Integer> entry : firstHashmap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                result = entry.getKey();
                System.out.println("This number; '" + entry.getKey() + "' occurs an odd number of times ");
            }
        }
        return result;
    }
}

//Lessons learned
//variables assigned to lambda functions must be declared final or effectively final so that the compiler can tell the final(latest/most updated) value the variable will contain
//to access variables in a loop from outside the loop, they must be initialized out of the loop.