package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;
import java.math.*;
/*
    coder : Himanshu Mishra
    Program to calculate minimum buckets needed to fill the roads with water
    */
public class Solution {

    /**
     * @param street  string representing the road
     * @return minimum no of buckets needed to fill the road with water
     */
    public static int minimumBuckets(String street) {

        int[] res = new int[street.length()]; // store the buckets needed to fill the holes at the road
        int hole = 0;

        int index = 0;
        while (index < street.length() && street.charAt(index) == 'H') { // Check if the starting road is full of holes
            index++;
        }

        // Check if the road doesn't have any holes
        if (index == street.length()) {
            return 0;
        }
        else {
            hole++;
            res[index] = 1;
        }

        // Check if the road has holes at first and last index
        if (street.charAt(street.length() - 1) == 'H') {
            hole++;
            res[street.length() - 1] = 1;
        }

        for (int i = 1; i < street.length() - 1; i++) {
            if (street.charAt(i) == 'H') {

                // Check if the first road has holes
                if (street.charAt(i - 1) == 'H') {
                    res[i] = res[i - 1]; // There is a hole at the index and last index also has hole
                    hole++;
                }
            }
                else if (street.charAt(i + 1) == 'H') {
                    res[i] = res[i + 1];
                    hole++;
                }
                else {
                    hole++;
                    res[i] = 1;
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