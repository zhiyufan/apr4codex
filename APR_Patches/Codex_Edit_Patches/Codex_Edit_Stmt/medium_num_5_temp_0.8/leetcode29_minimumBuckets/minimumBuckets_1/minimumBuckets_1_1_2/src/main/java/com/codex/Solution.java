package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        int output = 0;
        int[] res = new int[street.length()];

        for (int i = 0; i < street.length(); i++) {
            if (i == 0 && street.charAt(i) == '.') {
                output += 1;
                res[i] = 0;
            }
            else if (i == street.length() - 1 && street.charAt(i) == '.') {
                output += 1;
                res[i] = 0;
            }
            else if (street.charAt(i) == '.') {
                if (street.charAt(i-1) == 'H' && street.charAt(i+1) == 'H') {
                    output += 1;
                    res[i] = 0;
                }
                if (street.charAt(i-1) == 'H' && street.charAt(i+1) == '.') {
                    if (res[i+1] == 1) {
                        output += 1;
                        res[i] = 0;
                    }
                    else if (res[i+1] == 2) {
                        output += 1;
                        res[i] = 0;
                    }
                }
                if (street.charAt(i-1) == '.' && street.charAt(i+1) == 'H') {
                    if (res[i-1] == 1) {
                        output += 1;
                        res[i] = 0;
                    }
                    else if (res[i-1] == 2) {
                        output += 1;
                        res[i] = 0;
                    }
                }
                if (street.charAt(i-1) == '.' && street.charAt(i+1) == '.') {

                    if (res[i-1] == 0 && res[i+1] == 0) {
                        output += 1;
                        res[i] = 0;
                    }
                    if (res[i-1] == 0 && res[i+1] == 1) {
                        output += 1;
                        res[i] = 0;
                    }
                    if (res[i-1] == 0 && res[i+1] == 2) {
                        output += 1;
                        res[i] = 0;
                    }
                    if (res[i-1] == 1 && res[i+1] == 0) {
                        output += 1;
                        res[i] = 0;
                    }
                    if (res[i-1] == 1 && res[i+1] == 1) {
                        output += 1;
                        res[i] = 0;
                    }
                    if (res[i-1] == 1 && res[i+1] == 2) {
                        output += 1;
                        res[i] = 0;
                    }
                    if (res[i-1] == 2 && res[i+1] == 0) {
                        output += 1;
                        res[i] = 0;
                    }
                    if (res[i-1] == 2 && res[i+1] == 1) {
                        output += 1;
                        res[i] = 0;
                    }
                    if (res[i-1] == 2 && res[i+1] == 2) {
                        output += 1;
                        res[i] = 0;
                    }

            }


        }

    }
        /*
        if (res[i] == 2 && res[i+1] == 2) {
            output -= 1;
        }
            if (res[i] == 2 && res[i+1] == 1) {
                output -= 1;
            }
            if (res[i] == 1 && res[i+1] == 1) {
                output -= 1;
            }
            if (res[i] == 1 && res[i+1] == 2) {
                output -= 1;
            }
        }
    }



        /*
        for (int i =0; i < res.length; i++) {
            if (res[i] == 2) {
                output += 1;
            }

        return output;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        */
    }
}