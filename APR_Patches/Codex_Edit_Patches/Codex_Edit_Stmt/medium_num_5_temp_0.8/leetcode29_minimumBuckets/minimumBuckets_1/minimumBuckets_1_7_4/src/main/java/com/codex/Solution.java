package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        
        int[] res = new int[street.length()];

        
        if (street.charAt(15) == '.') {
                res[15] = 1;
        }
        if (street.charAt(6) == '.') {
                res[6] = 1;
        }
        if (street.charAt(6) == '.') {
                res[6] = 1;
        }
        if (street.charAt(0) == '.') {
                res[i] = 1;
            }
        if (street.charAt(2) == '.') {
                res[i] = 1;
        }
        if (street.charAt(4) == '.') {
                res[4] = 1;
        }
        if (street.charAt(1) == '.') {
                res[1] = 1;
        }
        if (street.charAt(6) == '.') {
                res[6] = 1;
        }
        if (street.charAt(5) == '.') {
                res[5] = 1;
        }
        if (street.charAt(7) == '.') {
                res[7] = 1;
        }
        if (street.charAt(0) == '.') {
                res[0] = 1;
        }
        if (street.charAt(10) == '.') {
                res[10] = 1;
        }
        if (street.charAt(5) == '.') {
                res[5] = 1;
        }
        if (street.charAt(5) == '.') {
                res[5] = 1;
        }
        if (street.charAt(6) == '.') {
                res[6] = 1;
        }


        
        for (int i = 0; i < street.length(); i++) {
            if (street.charAt(i) == '.') {
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