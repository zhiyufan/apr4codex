package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        
        int[] res = new int[street.length()];

        for (int i = 0; i < street.length(); i++) {
            if (i == 0 && street.charAt(i) == '.') {
                res[i] = 1;
            }
            else if (i == street.length() - 1 && street.charAt(i) == '.') {
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
            if (res[i] < output) {
                output = res[i];
            }

        }
        return output;

    }

    /*
    1.  The output is smaller than the value in res, we know that it's dirty. The value in the array is the minimum number of buckets needed to clean it.
    2.  The output is already greater than the value, we know that it's already clean.
    3.  If the value is a '.', we know that the previous and next spots determine how many buckets we need to clean it.
    4.  If the value is an 'H' in one direction and a '.' in the other, we know that the initial value of the '.' dictates how many buckets we need.
    5.  If the value is a 'H' on both sides, it will always be 2 buckets.

    // it would be better if we didn't have the first if statement in there and just said output < res[i]
    */
    /*
    // return output
    // 1.  The output is smaller than the value in res, we know that it's dirty. The value in the array is the minimum number of buckets needed to clean it.
    // 2.  The output is already greater than the value, we know that it's already clean.
    // 3.  If the value is a '.', we know that the previous and next spots determine how many buckets we need to clean it.
    // 4.  If the value is already 2, we know it's dirty. We will only clean one bucket, but it still counts.
    // 5.  If the value is an 'H' in one direction and a '.' in the other, we know that the initial value of the '.' dictates how many buckets we need.
    // 6.  If the value is a 'H' on both sides, it will always be 2 buckets.

    // it would be better if we didn't have the first if statement in there and just said output < res[i]
    */
    public static int minimumBuckets(String street) {
        int[] res = new int[street.length()];

        for (int i = 0; i < street.length(); i++) {
            if (i == 0 && street.charAt(i) == '.') {
                res[i] = 1;
            }
            else if (i == street.length() - 1 && street.charAt(i) == '.') {
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
        for (int i =0; i < res.length; i++) {
            if (res[i] == 2) {
                output += 1;
            }
        }

        return output;

    }
}