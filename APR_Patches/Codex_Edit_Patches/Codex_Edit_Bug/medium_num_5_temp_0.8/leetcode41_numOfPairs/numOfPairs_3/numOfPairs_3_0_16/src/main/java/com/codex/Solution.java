package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) || Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target)) ans++;
            }
        }
        return ans;
    }

    
    
    
    
    
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int newVal = 0;
        while (n != 0) {
            int temp = n % 10;
            newVal = newVal * 10 + temp;
            n /= 10;
        }
        while (newVal != 0) {
            if (newVal % 2 == 1) {
                count++;
            }
            newVal /= 2;
        }
        System.out.print(count);
    }
}    
    
    
}