package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {

        int count = 0;
        if (street.length() == 0) {
            return 0;
        }

        for (int i = 1; i < street.length(); i++) {
            if (street.charAt(i) == 'H' && street.charAt(i - 1) != 'H') {
                count++;
            }

        }
        return count;
    }


    
}