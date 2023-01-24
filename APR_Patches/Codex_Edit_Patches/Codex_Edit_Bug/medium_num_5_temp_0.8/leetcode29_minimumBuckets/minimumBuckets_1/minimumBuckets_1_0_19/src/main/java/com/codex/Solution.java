package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        
        int[] res = getNrOfBuckets(street);
        int output = 0; // take into account that the first and last house already have a bucket
        for (int i =0; i < res.length; i++) {
            if (res[i] == 2) {
                output += 1;
            }
        }

        return output;
    }
}