package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {
    
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if(map.containsKey(nums[i])) {
            map.put(nums[i], map.get(nums[i]) + 1);
        } else {
            map.put(nums[i], 1);
        }
    }
    for (int i = 0; i < nums.length; i++) {
        if(map.containsKey(nums[i] + 1)) {
            count += 1;
        }
    }
    return count;
}


public class Solution {
    public int getSum(int a, int b) {
        int sum = 0, carry = 0;
        
        while (b != 0) {
            sum = a ^ b;
            carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return sum;
    }
}

    
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        
        int start = 0, end = A.length-1;
        int result = -1;
        while(start < end) {
            int sum = A[start] + A[end];
            if(sum < K) {
                result = Math.max(sum, result);
                start++;
            } else {
                end--;
            }
        }
        return result;
    }

}
}