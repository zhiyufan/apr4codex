package com.codex;

import java.util.*;

public class Solution {
import java.util.stream.IntStream;

    public static int[] findEvenNumbers(int[] digits) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (j == k || j == i || k == i) {
                        continue;
                    }
                    int a = digits[i];
                    int b = digits[j];
                    int c = digits[k];
                    int num = a * 100 + b * 10 + c;
                    if (num % 2 == 0)
                        result.add(num);
                }
            }
        }

        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        findEvenNumbers(arr);
    }
}