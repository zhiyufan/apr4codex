package com.codex;

import java.util.*;

public class Solution {
public static int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        int right = n - 1, left = 0;
        while (left <= right) {
            while (left <= right && nums[left] <= pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }

    /*
    Can you fix the broken code in the editor so it prints the following?
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    11
    */
    import java.io.*;
public class MyClass {
    public static void main(String args[]) {
       int k = 1;
       for(int i = 1; i < 4; i++) {
         for(int j = 1; j < 4; j++) {
           if (i == j)
             continue;
           System.out.println(k);
           k++;
         }
       }
     }
}


//There is a mistake in the code on line 4, can you fix it?
public class MyClass {
    public static void main(String args[]) {
      for(int x= 1; x < 5; x++) {
        for(int y= 1; y < 5; y++) {
          System.out.print(x);
          System.out.print(y + " ");
        }
      }
    }
}

}