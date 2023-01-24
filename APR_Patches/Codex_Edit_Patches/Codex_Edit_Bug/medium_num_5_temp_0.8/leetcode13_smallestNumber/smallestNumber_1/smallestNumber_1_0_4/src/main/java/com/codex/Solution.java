package com.codex;

import java.util.*;

public class Solution {
public static long smallestNumber(long num) {

        boolean isAllNine = true;
        int[] res = new int[10];
        while (num > 0) {
            if ((num % 10) != 9)
                isAllNine = false;
            res[(int)(num % 10)]++;
            num /= 10;
        }
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (res[i] > 0) {
                index = i;
                res[i]--;
                break;
            }
        }
        long min = index;
        for (index = 0; index < 10; index++) {
            while (res[index]-- > 0) {
                min = min * 10 + index;
            }
        }
        return isAllNine ? -1 : min;
    }
    
Input
4545454545

Its Correct output is:
499999999

And Your Code's output is:
4545454444
}