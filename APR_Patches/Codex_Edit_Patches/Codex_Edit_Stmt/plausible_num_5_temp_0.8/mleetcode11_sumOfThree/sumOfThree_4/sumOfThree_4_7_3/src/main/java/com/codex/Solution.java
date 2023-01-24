package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[] {num / 3, num / 3, num / 3};
        if (num % 3 == 1) {
            result[2] = result[2] + 1;
        } else if (num % 3 == 2) {
            result[0] = result[0] + 1;
            result[1] = result[1] + 1;
        }
        return result;
    }
}
}