package com.codex;

import java.util.*;

public class Solution {
 public static int[] getLuckyNumbers(int low, int high) {
        int[] result = new int[high - low + 1];
        int size = 0;
        for (int i = low; i <= high; i++) {
            if (isLucky(i)) {
                result[size++] = i;
            }
        }
        System.arraycopy(result, 0, result, 0, size);
        return result;
    }

    private static boolean isLucky(int number) {
        

        while (number > 0) {
            int digit = number % 10;
            if (digit == 0 || digit == 1 || digit == 2 || digit == 3 || digit == 5) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}