package com.codex;

import java.util.*;

public class Solution {
/* 

Given an array of integers A where each element of the array is either 0 or 1.

You need to find the length of the longest subarray with all the elements equal to 0.

Input Format

The only argument given is the integer array A.
Output Format

Return the length of the longest subarray with all the elements equal to 0.
Constraints

1 <= length of the array <= 100000
0 <= A[i] <= 1
For Example

Input 1:
    A = [0, 0, 1, 0, 1, 1, 0, 0, 1, 1]
Output 1:
    5
Explanation 1:
    The subarray [0, 0, 1, 0, 0] has all the elements equal to 0.

Input 2:
    A = [1, 1, 1]
Output 2:
    0
*/




import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {0, 0, 1, 0, 1, 1, 0, 0, 1, 1};
        int[] b = {1, 1, 1};
        System.out.println(getMaxZeroLength(a));
    }
    
    static int getMaxZeroLength(int[] arr){
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                count = 0;
            }
            if (count > max_count) {
                max_count = count;
            }
        }
        return max_count;
    }
    
}

    public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length/2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < changed.length; i++) {
            if (set.contains(changed[i]/2)) {
                set.remove(changed[i]/2);
            } else {
                if (changed[i] % 2 == 0) {
                    set.add(changed[i]/2);
                } else {
                    return new int[]{};
                }
            }
        }
        if (!set.isEmpty()) {
            return new int[]{};
        }
        int k = 0;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                original[k] = changed[i]/2;
                k++;
            }
        }
        return original;
    }


    
}