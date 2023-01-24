package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        int result = Integer.MAX_VALUE;

        char[] streetCharArr = street.toCharArray();
        for (int i=0; i<streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                int j = i-1;
                int countH = 1;
                int countDot = 1;
                while(j>=0) {
                    if (streetCharArr[j] == 'H')
                        countH++;
                    if (streetCharArr[j] == '.')
                        countDot++;
                    j--;
                }
            }
        }
        return count;
    }

    
}