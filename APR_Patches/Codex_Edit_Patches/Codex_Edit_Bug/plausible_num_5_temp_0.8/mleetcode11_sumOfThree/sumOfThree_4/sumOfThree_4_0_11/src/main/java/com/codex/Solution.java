package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        long[] arr = new long[3];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        if (num % 3 != 0) return new long[0];

        return arr;

    }
}