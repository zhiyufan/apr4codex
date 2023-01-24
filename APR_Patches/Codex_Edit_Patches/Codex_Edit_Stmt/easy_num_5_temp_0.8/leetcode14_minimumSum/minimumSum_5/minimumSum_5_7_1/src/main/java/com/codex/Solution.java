package com.codex;

import java.util.*;

public class Solution {
public int minSum(int num) {
    String numString = String.valueOf(num);
    int min = num;
    for (int i = 1; i < numString.length(); i++) {
        String new1 = numString.substring(0, i);
        String new2 = numString.substring(i, numString.length());
        int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
        if (sum < min) {
            min = sum;
        }
    }

    return min;
}
}