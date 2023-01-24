package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        return count;



 
public int solve(int A, int B, int C, int D) {
        int[] sum = new int[A + B + C + D + 1];
        //sum[0] = 1;

        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 0; k <= C; k++) {
                    for (int l = 0; l <= D; l++) {
                        sum[i + j + k + l]++;
                    }
                }
            }
        }

        int result = 0;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 0; k <= C; k++) {
                    if (A - i - k >= 0 && B - j >= 0 && C - k >= 0) {
                        result += sum[A - i - k + B - j + C - k + D];
                    }
                }
            }
        }

        return result;
    }
    }

    
}