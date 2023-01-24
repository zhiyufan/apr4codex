package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum = mean * (rolls.length + n) - Arrays.stream(rolls).sum();
        return (sum % n == 0 && sum / n >= 1 && sum / n <= 6) ? IntStream.range(0, n).map(i -> sum / n).toArray() : new int[]{};
    }

    
}