package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        ArrayList<Integer> nums = new ArrayList<>();

        int n = (int)num;
        int count = 0;
        while (n > 0) {
            nums.add(n % 10);
            n = n / 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = nums.get(i);
        }
        
        Arrays.sort(arr);
        n = 0;
        for (int i = 0; i < count; i++) {
            n = 10 * n + arr[i];
        }
        return n;
    }

    
}