package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                }
            }

        public static int . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .(int[] k) {
        
        int count = 0;

        for (int i = 0; i < k.length; i++) {
            if (k[i] == 0) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    


    public static boolean . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .(int[] k) {
        
        int count = 0;
        for (int i = 0; i < k.length; i++) {
            if (k[i] == 0) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    

    public static void . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .(int[] k) {
        
        for (int i = 0; i < k.length - 1; i++) {
            for (int j = i + 1; j < k.length; j++) {
                if (k[i] == k[j] && i != j) {
                    System.out.println(k[j]);
                    return;
                }
            }
        }
    }
    
        }
        return count;
    }

    
}