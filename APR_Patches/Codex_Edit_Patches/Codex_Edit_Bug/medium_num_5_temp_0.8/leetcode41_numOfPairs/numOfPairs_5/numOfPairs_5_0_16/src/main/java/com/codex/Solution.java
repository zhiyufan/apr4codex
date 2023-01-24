package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        String[] num = new String[nums.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = nums[i];
        }
        Arrays.sort(num);
    
        int count = 0;
        int i = 0;
        int j = num.length - 1;
        while (i < j) {
            if (Integer.valueOf(num[i] + num[j]) == Integer.valueOf(target)) {
                i++;
                j--;
            }
            else if (Integer.valueOf(num[i] + num[j]) < Integer.valueOf(target)) i++;
            else j--;
        }
    
        i = 0;
        j = num.length - 1;
        while (i < j) {
            if (Integer.valueOf(num[i] + num[j]) == Integer.valueOf(target)) {
                count++;
             
                int k = i + 1;
                while (k < j && num[k].equals(num[i])) {
                    count++;
                    k++;
                }
             
                k = j - 1;
                while (k > i && num[k].equals(num[j])) {
                    count++;
                    k--;
                }
                
                i++;
                j--;
            
            } else if (Integer.valueOf(num[i] + num[j]) < Integer.valueOf(target)) i++;
            else j--;
        }
    
        return count;
    }
}