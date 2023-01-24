package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        
        int[] res = new int[street.length()];

        for (int i = 0; i < street.length(); i++) {
            if (i == 0 && street.charAt(i) == '.' || street.charAt(i) == 'H') {
                res[i] = 1;
            }
            else if (i == street.length() - 1 && street.charAt(i) == '.' || street.charAt(i) == 'H') {
                res[i] = 1;
            }
            else if (street.charAt(i) == '.') {
                if (street.charAt(i-1) == 'H' && street.charAt(i+1) == 'H') {
                    res[i] = 2;
                }
                if (street.charAt(i-1) == 'H' && street.charAt(i+1) == '.') {
                    if (res[i+1] == 1) {
                        res[i] = 1;
                    }
                    else if (res[i+1] == 2) {
                        res[i] = 2;
                    }
                }
                if (street.charAt(i-1) == '.' && street.charAt(i+1) == 'H') {
                    if (res[i-1] == 1) {
                        res[i] = 1;
                    }
                    else if (res[i-1] == 2) {
                        res[i] = 2;
                    }
                }
            }

        }
        int output = 0;
        for (int i =0; i < res.length; i++) {
            if (res[i] == 2) {
                output += 1;
            }
        }

        return output;


    }
}