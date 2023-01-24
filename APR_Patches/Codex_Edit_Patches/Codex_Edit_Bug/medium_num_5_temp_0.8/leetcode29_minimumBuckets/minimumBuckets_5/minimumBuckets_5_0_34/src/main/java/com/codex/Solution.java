package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int count = 0;
        for (int i = 0; i < street.length(); i++) {
            if (i == 0) {
                if (street.charAt(i) == 'D') {
                    count++;
                }
            }
            else if (street.charAt(i) == 'D' && street.charAt(i - 1) != 'D') {
                count++;
            }
        }
        return count;
    }


    
}