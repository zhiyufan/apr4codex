package com.codex;

import java.util.*;

public class Solution {
    public static Integer[] sumOfThree(Integer num) {
        
        Integer[] array = new Integer[0];

        if (num < 3) return array;

        for (Integer a = 1; a < num - 1; ++a) {
            for (Integer b = a + 1; b < num; ++b) {
                for (Integer c = b + 1; c < num + 1; ++c) {
                    if (a + b + c == num) {
                        array = new Integer[]{a, b, c};
                        return array;
                    }
                }
            }
        }
        return array;
    }

    
}