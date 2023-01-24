package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int countH = 0, countT = 0;
        for (int i = 0; i < street.length(); i++) {
            if (i == 0) {
                if (street.charAt(i) == 'H') {
                    countH++;
                }
            }
            else if (street.charAt(i) == 'H' && street.charAt(i - 1) != 'H') {
            if (i == 0) {
                if (street.charAt(i) == 'T') {
                    countT++;
                }
            }
            else if (street.charAt(i) == 'T' && street.charAt(i - 1) != 'T') {
                countT++;
            }

                countH++;
            }
        }
        var min = Math.min(countH, countT);
        return min;
    }


    
}