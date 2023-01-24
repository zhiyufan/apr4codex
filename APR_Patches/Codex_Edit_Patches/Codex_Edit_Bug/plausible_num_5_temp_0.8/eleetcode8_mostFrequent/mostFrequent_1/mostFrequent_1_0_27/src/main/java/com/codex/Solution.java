package com.codex;

import java.util.*;

public class Solution {
public class task_one {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 4, 5, 5, 4, 3};

        System.out.print(mostFrequent(nums,3));
    }

    //method that returns the most frequent element
    //  in an array.
    public static int mostFrequent(int[] nums, int key)
    {

        int count = 0;
        int maxCount = 0;
        int target = 0;

        int maxCount = 0;
        int target = 0;
        //loop through the array to find the element
        //  that has the most occurence
        //with a nested loop,
        //i loop through the array to search
        //      for the element while
        //j also loops through the array to compare
        //      the element to every element in the array.
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == key)
            {
                for (int j = 0; j < nums.length; j++)
                {
                    if (nums[j] == nums[i])
                    {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    target = nums[i + 1];
                }
            }
        }

        return target;
    }

    
}