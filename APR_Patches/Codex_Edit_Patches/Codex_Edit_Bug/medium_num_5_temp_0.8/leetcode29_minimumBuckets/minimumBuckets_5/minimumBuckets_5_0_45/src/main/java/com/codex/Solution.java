package com.codex;

import java.util.*;

public class Solution {
    /* javac -d classfiles MinimumBuckets.java ; java -cp classfiles MinimumBuckets */

    public static int minimumBuckets(String street) {

        int count = 0;
        for (int i = 0; i < street.length(); i++) {
            if (i == 0) {
                if (street.charAt(i) == 'H') {
                    count++;
                }
            }
            else if (street.charAt(i) == 'H' && street.charAt(i - 1) != 'H') {
                count++;
            }
        }
        return count;
    }


    
}