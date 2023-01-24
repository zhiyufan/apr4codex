package com.codex;

import java.util.*;

public class Solution {
    //18.06.2020
    public int[] rearrangeArray(int[] nums) {
        
        double avg = (double) avg(nums);
        
        int size = 0;
        
        for (int num : nums) {
            if (num != avg) {
                size++;
            }
        }

        
        int[] tmp = new int[size];
        int index = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > avg) {
                tmp[index++] = nums[i];
            }
        }
        
        Arrays.sort(tmp);
        index = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] < avg) {
                nums[i] = tmp[index++];
            } else if (nums[i] > avg) {
                nums[i] = tmp[index++];
            }
        }
        return nums;
    }

    
    private int avg(int[] nums) {
        
        int sum = 0;
        for(int num : nums) {
            sum += num;        
        }
        return sum / nums.length;
    }

    
}