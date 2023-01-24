package com.codex;

import java.util.*;

public class Solution {
    private static int solution(int[] A) {
        int n = A.length;
        int k = n + 1;
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        return sum;
    }

    
}