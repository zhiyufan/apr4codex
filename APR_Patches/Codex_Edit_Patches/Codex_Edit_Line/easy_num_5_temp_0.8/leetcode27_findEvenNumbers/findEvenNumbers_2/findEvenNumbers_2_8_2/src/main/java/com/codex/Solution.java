package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        int[] result1 = new int[19]{};
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < digits.length - 2; i++) {
            for (int j = i + 1; j < digits.length - 1; j++) {
                for (int k = j + 1; k < digits.length; k++) {
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) {
                        result.add(num);
                    }
                }
            }
        }
        Collections.sort(result);
        int counter = 0;
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result1.length; j++) {
                if (result.get(i) > result1[i]) {
                    counter = j;
                    break;
                }
            }
            for (int j = result1.length; j > counter; j--) {
                result1[j] = result1[j - 1];
            }
            result1[counter] = result.get(i);
        }
        return result1;
    }

    
}