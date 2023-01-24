package com.codex;

import java.util.*;

public class Solution {

/**
 * Example program #1 from Chapter 8 of Absolute Begnner's Guide to C, 3rd Edition
 * File:    chapter8ex1.c
 * 
 * Victor Barriga 
 * victorbarriga@live.com
 * 
 * This program defines a simple structure that holds the weather data for a 
 * particular day. It ask the user for a high and low temperature and whether 
 * or not it rained. It then passes the structure to a function and that function 
 * displays the information in a short report.
 *
 */

#include <stdio.h>

// the weather data will be stored in a structure

typedef struct weathereport
{
    int high;
    int low;
    float rainfall;
    _Bool rain;
} weather;

weather report;

// function prototype in the same order as they are in the source code
    public static int sumOfBeauties(int[] nums) {
        // define an array of integers
        int nums[10];
        //  // and an int variable to count with
        int ctr;

        printf("Enter 10 integers: ");
        // use the scanf() function to read in values
        for (ctr = 0; ctr < 10; ctr++)
        {
            scanf("%d, ", &nums[ctr]);
        }
        // call our function passing the array as a parameter
        printf("The sum of the array is: %d\n", sumOfTen(nums));

        return 0;
    }


    // this function takes an array of integers and returns the sum of them
    int sumOfTen(int nums[10])
    {
        // define an integer to hold the sum
        int sum = 0;
        // use a for loop to cycle through the array and add up its values
        for (int ctr = 0; ctr < 10; ctr++)
        {
            sum += nums[ctr];
        }
        // return the sum to the calling function
        return sum;
    }

    int sumOfBeauties(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int min = nums[0];
        int max = nums[nums.length - 1];
        int[] res = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min) { left[i] = 1; }
            min = Math.min(nums[i], min);
            if (nums[nums.length - 1 - i] < max) { right[nums.length - 1 - i] = 1; }
            max = Math.max(nums[nums.length - 1 - i], max);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (left[i] == 1 && right[i] == 1) { res[i] = 2; } 
            else if (left[i] == 1 || right[i] == 1) { res[i] = 1; }
        }
        
        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        return sum;
    }


// this function takes the weather structure as a parameter and displays it
void printreport(weather report)
{
    printf("Here is the weather report for today:\n");
    printf("High: %d degrees\n", report.high);
    printf("Low: %d degrees\n", report.low);
    printf("Rainfall: %.2f\n", report.rainfall);

    if (report.rain == 1)
    {
        printf("It rained today.\n");
    }
    else
    {
        printf("It did not rain today.\n");
    }
}
}