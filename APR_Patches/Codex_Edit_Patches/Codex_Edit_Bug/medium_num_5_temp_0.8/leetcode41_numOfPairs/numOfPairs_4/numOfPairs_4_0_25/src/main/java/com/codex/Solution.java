package com.codex;

import java.util.*;

public class Solution {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println(sumOfTwo(numbers));
    }

    
}