package com.codex;

import java.util.*;

public class Solution {
    class Solution{
        
        public static long minimalKSum(int[] nums, int k) {
            
            long sum = 0;
            for(int num : nums) {
                if(num > k) {
                    sum += k;
                }
                else{
                    sum += nums;
                }
            }
        }
        long sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }

    
}