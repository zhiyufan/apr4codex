package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        

        int count = 0;

        if((nums.length % 2) != 0){
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if ((nums[i] + nums[j]).equals(target) && i != j) {
                        count++;
                    }
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if ((nums[i] + nums[j]).equals(target)) {
                        count++;
                    }
                }
            }
        }

        /**
         * If string array has odd elements
         */
        
        /**
         * For loop that loops through the string array,
         * comparing index i to all indexes j 
         * in array 2 to n
         */
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
        }*/

        /**
         * For loop that loops through the string array,
         * comparing index i to all indexes j 
         * in array 2 to n
         */
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                }
            }
                if ((nums[i] + nums[j]).equals(target)) {

        /**
         * If string array has even elements
         */
   

                    count++;
                }
            }
        }
        return count;
    }

    
}