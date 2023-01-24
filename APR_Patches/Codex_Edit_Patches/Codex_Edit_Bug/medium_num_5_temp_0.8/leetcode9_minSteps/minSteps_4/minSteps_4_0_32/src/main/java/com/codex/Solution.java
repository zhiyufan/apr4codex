package com.codex;

import java.util.*;

public class Solution {
/*********************************************************************
    Problem: Given an integer array of size n, find all elements that appear
    more than n/3 times. The algorithm should run in linear time and in O(1)
    space.
 *********************************************************************/
import java.util.*;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int a = 0, b = 0, countA = 0, countB = 0;
        for (int n : nums) {
            if (a == n) {
                countA++;
            } else if (b == n) {
                countB++;
            } else if (countA == 0) {
                a = n; countA = 1;
            } else if (countB == 0) {
                b = n; countB = 1;
            } else {
                countA--;
                countB--;
            }
        }
        countA = countB = 0;
        for (int n : nums) {
            if (n == a) 
                countA++;
            else if (n == b) 
                countB++;
        }
        if (countA > nums.length / 3) 
            result.add(a);
        if (countB > nums.length / 3) 
            result.add(b);
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {1, 2, 3};
        int[] b = {3, 3, 3, 1, 1, 2, 2, 2, 2, 4};
        System.out.println(sol.majorityElement(a));
        System.out.println(sol.majorityElement(b));
    }
}

    
}