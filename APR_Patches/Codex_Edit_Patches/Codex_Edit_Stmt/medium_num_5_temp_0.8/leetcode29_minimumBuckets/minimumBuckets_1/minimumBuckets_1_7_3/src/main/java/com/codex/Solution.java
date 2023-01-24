package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        
        int[] res = new int[street.length()];

        for (int i = 0; i < street.length(); i++) { // for (int i = 1; i < street.length() - 1; i++) { // if you do need to check only middle dots
            if (i == 0 && street.charAt(i) == '.') { // removed
                res[i] = 1;
            }
            else if (i == street.length() - 1 && street.charAt(i) == '.') { // removed
                res[i] = 1;
            }
            else if (street.charAt(i) == '.') {
                if (street.charAt(i-1) == 'H' && street.charAt(i+1) == 'H') { // removed
                    res[i] = 2;
                }
                if (street.charAt(i-1) == 'H' && street.charAt(i+1) == '.') { // removed
                    if (res[i+1] == 1) {
                        res[i] = 1;
                    }
                    else if (res[i+1] == 2) {
                        res[i] = 2;
                    }
                }
                if (street.charAt(i-1) == '.' && street.charAt(i+1) == 'H') { // removed
                    if (res[i-1] == 1) {
                        res[i] = 1;
                    }
                    else if (res[i-1] == 2) {
                        res[i] = 2;
                    }
                }

                //if (street.charAt(i-1) == 'H' && street.charAt(i+1) == '?') {
                //    if (res[i+1] == 1) {
                //        res[i] = 1;
                //    }
                //    else if (res[i+1] == 2) {
                //        res[i] = 2;
                //    }
                //}

                //if (street.charAt(i-1) == '?' && street.charAt(i+1) == '.') {
                //    if (res[i-1] == 1) {
                //        res[i] = 1;
                //    }
                //    else if (res[i-1] == 2) {
                //        res[i] = 2;
                //    }
                //}
            }

        }
        int output = 0; // int output = 1;
        //for (int i =0; i < res.length; i++) { // int i = 1; i < res.length - 1; i++
        for (int i = 1; i < res.length - 1; i++) {
            if (res[i] == 2) {
                output += 1;
            }

        //if (street.charAt(0) == '?' || street.charAt(street.length() - 1) == '?') {
        //    output += 1;
        //}

        //if (street.charAt(0) == 'H') {
        //    output += 1;
        //}

        //if (street.charAt(street.length() - 1) == 'H') {
        //    output += 1;
        //}
        }

        return output; // return output + 1;


    }
}