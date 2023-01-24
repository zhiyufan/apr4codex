package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        final int[] arr = new int[1001];
        for (int x : nums) {
            arr[x]++;
        }
        int count = arr[0] * arr[1];
        for (int i = 2; i < arr.length; i++) {
            count += arr[i] * arr[i - 1];
            }
        return count;
    }

    
}