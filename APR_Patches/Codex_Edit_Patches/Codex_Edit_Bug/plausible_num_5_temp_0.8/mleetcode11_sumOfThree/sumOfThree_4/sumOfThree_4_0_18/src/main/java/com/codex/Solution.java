package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
       
        if (num < 3) return new long[0];
        long[] res = new long[3];
        res[0] = 3;
        res[1] = (num-3) /2;
        res[2] = num - (res[0] + res[1]);
        return res;

    }
}