package com.company;

public class Main {

    public static void main(String[] args) {
	AssignmentOne test = new AssignmentOne();
    test.firstMethod();
    Trolls test_2 = new Trolls();
    test_2.disemvowel("pretttyioehuraaataaspreeiOOIEaaaatEIORTTYOIEAAUIINTRWFtyhuaaaarts");
    BitCounting test_3 = new BitCounting();
    test_3.countBits(523);
    OddCount test_4 = new OddCount();
    int[] arr_1 = {2,3,4,5,3,2,4,4,67,5,5,67,3,4,5,5,3,3,0,9,0,9,3};
    test_4.findIt(arr_1);
    TwoSum mySum = new TwoSum();
    int [] numbers = new int[]{1,2,};
    mySum.twoSum(numbers, 3);
    DigitalRoot test_5 = new DigitalRoot();
    test_5.digital_root(988);
    }
}
