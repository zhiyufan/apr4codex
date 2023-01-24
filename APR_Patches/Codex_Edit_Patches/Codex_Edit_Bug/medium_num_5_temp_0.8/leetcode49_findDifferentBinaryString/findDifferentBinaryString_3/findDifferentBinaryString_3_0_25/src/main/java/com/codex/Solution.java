package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

/**
 * Given an array of n integers and an integer x.
 * 
 * We can perform addition operation on any two of the array elements.
 * 
 * If we can find a pair of array elements a & b such that a + b = x,
 * 
 * print "Yes" else Print "No". Note: There can be duplicates in the array.
 * 
 * Reference : https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 */

/**
 * Solution :
 * 
 * The solution would be to print the sum of pair of elements in the given
 * array, which equals to the given sum.
 * 
 * The output should be printed as "Yes" or "No".
 */

public class FindSumExistsOrNotInTheGivenArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            int sum = sc.nextInt();
            System.out.println(findSumExistsOrNot(arr, sum) ? "Yes" : "No");
        }
        sc.close();
    }


    private static boolean findSumExistsOrNot(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int firstElement = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int secondElement = arr[j];

                if (firstElement + secondElement == sum) {
                    return true;
                }

            }
        }
        return false;
    }
}
}