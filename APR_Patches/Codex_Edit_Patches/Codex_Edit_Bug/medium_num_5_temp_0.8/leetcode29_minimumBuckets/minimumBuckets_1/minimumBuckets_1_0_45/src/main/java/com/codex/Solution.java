package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Trash {
    public static void main(String[] args) {
        String street = "......";
        System.out.println(minimumBuckets(street));
    }

    public static int minimumBuckets(String street1) {
        
        int[] res = new int[street1.length()];

        for (int i = 0; i < street1.length(); i++) {
            if (i == 0 && street1.charAt(i) == '.') {
                res[i] = 1;
            }
            else if (i == street1.length() - 1 && street1.charAt(i) == '.') {
                res[i] = 1;
            }
            else if (street1.charAt(i) == '.') {
                if (street1.charAt(i-1) == 'H' && street1.charAt(i+1) == 'H') {
                    res[i] = 2;
                }
                if (street1.charAt(i-1) == 'H' && street1.charAt(i+1) == '.') {
                    if (res[i+1] == 1) {
                        res[i] = 1;
                    }
                    else if (res[i+1] == 2) {
                        res[i] = 2;
                    }
                }
                if (street1.charAt(i-1) == '.' && street1.charAt(i+1) == 'H') {
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
            System.out.println(res[i]);
            }
        }

        return output;

    }
}