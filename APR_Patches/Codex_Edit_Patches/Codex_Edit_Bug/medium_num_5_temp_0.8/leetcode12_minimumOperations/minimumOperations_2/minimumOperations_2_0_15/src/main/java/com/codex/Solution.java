package com.codex;

import java.util.*;

public class Solution {
    public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += ((i + 1) * (arr.length - i) + 1) / 2 * arr[i];
        }
        return sum;
    }
}

    
}