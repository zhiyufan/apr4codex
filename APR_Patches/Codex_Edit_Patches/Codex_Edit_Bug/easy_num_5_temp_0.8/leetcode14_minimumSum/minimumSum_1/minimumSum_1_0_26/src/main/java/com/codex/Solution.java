package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        

        String[] split = String.valueOf(num).split("");
        if (split.length == 1)
            return Integer.parseInt(split[0]);
        if (split.length == 2)
            return Integer.parseInt(split[1]) + Integer.parseInt(split[0]);
        List<String> digits = new ArrayList<>(Arrays.asList(split));
        Collections.sort(digits);
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for (int i = digits.size() - 1; i >= 0; i--) {
            first.append(digits.get(i));
            if (i > 0)
                second.append(digits.get(i - 1));
            i--;
        }
        return Integer.parseInt(first.toString()) + Integer.parseInt(second.toString());
    }

    
}