package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        street = street.toUpperCase();

        int count = 0;
        for (int i = 0; i < street.length(); i++) {
            if (i == 0) {
                if (street.charAt(i) == 'H') {
                    count++;
                }
            }
            else if (street.charAt(i) == 'H' && street.charAt(i - 1) != 'H') { // Else if the current house is a true house and the house to the left of the current house is not a true house, add a bucket to the final count
                count++;
            }
        }
        return count;
    }


    
}