package com.codex;

import java.util.*;

public class Solution {
    public static String addBinary(String a, String b) {
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (i >= 0 || j >= 0) {
            
            int sum = 0;
            
            if (i >= 0 && a.charAt(i) == '1') {
                sum++;
            }
            
            if (j >= 0 && b.charAt(j) == '1') {
                sum++;
            }
            
            sum += carry;
            
            if (sum >= 2) {
                carry = 1;
            } else {
                carry = 0;
            }
            
            sb.append(sum % 2);
            
            i--;
            j--;
            
        }
        
        if (carry == 1) {
            sb.append(carry);
        }
        
        return sb.reverse().toString();
        
    }


    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int start = 0;
        int deficit = 0;
        int tank = 0;
        
        for (int i = 0; i < gas.length; i++) {
            
            tank = tank + gas[i] - cost[i];
            
            if (tank < 0) {
                
                start = i + 1;
                deficit += tank;
                tank = 0;
                
            }
            
        }
        
        return deficit + tank < 0 ? -1 : start;
        
    }
    
    public int findMin(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
                }
            }
        }
        
        return nums[low];
        
    }

    
}