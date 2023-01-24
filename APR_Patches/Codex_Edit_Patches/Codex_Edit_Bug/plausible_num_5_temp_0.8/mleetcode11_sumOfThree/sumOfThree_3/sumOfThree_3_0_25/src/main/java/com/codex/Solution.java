package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static long[] sumOfThree(long num) {

        long[] result = new long[3];
        for (int i = 1; i <= num / 3; i++) {
            for (int j = i + 1; j <= num; j++) {
                for (int k = j + 1; k <= num - i; k++) {
                    if (i + j + k == num) {
                        result[0] = i;
                        result[1] = j;
                        result[2] = k;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        long[] result = sumOfThree(40);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
}