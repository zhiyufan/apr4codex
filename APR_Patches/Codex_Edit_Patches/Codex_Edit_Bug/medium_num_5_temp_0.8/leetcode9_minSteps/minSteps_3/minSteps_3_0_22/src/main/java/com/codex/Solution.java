package com.codex;

import java.util.*;

public class Solution {
// Swapping of the numbers
public static void main(String[] args) {
        FirstNum = 2019;
        SecondNum = 2011;
        System.out.println("Before Swapping");
        System.out.println("First Number : " + FirstNum);
        System.out.println("Second Number : " + SecondNum);
        // Swapping logic
        Temp = FirstNum;
        FirstNum = SecondNum;
        SecondNum = Temp;
        System.out.println("After Swapping");
        System.out.println("First Number : " + FirstNum);
        System.out.println("Second Number : " + SecondNum);
}
}