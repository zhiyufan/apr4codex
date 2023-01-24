package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        
        int counter = 0;
        int m = 0;

        int count = 0;
        for (int i = 0; i < street.length(); i++) {
            if (i == 0) {
                if (street.charAt(i) == 'D') {
                    counter++;
                }
            }
            else if (street.charAt(i - 1) == 'D' && street.charAt(i) != 'D') {
                count += (counter) / 2;
                counter = 0;
            }
            else if (street.charAt(i - 1) == 'D' && street.charAt(i) == 'D') {
                counter++;
            }
            else if (street.charAt(i - 1) != 'D' && street.charAt(i) == 'D') {
                m = i;
            }
            else if (street.length() - 1 == i && street.charAt(i) == 'D') {
                count += (i - m + 1) / 2;
            }
        }
        return count;
    }


    
}