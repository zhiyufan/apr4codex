package com.codex;

import java.util.*;

public class Solution {
public class Test {
    
    private static final int N = 100;
    private static int[] nums = new int[N];
    
    public static long minimalKSum(int[] nums, int k) {  
        // sum of the first k smallest numbers
        // from an unsorted input array

        Arrays.sort(nums);
        int cur = 1;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > cur) {
                k--;
                sum += cur;
                cur++;
            } else if (nums[i] == cur) {
                cur++;
            }
        }
        while (k > 0) {
            sum += cur;
            cur++;
            k--;
        }
        return sum;
    }
    
    private static void shuffle(int[] nums) {
        // shuffle input array

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int j = ThreadLocalRandom.current().nextInt(i, n);
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    private static int[] init() {
        // initialize input array

        int sum = 0;
        for (int i = 0; i < N; i++)
             nums[i] = i + 1;
        shuffle(nums);
        return nums;
    }

    public static void main(String[] args) {
        init();
        System.out.println(Arrays.toString(nums));
        
        long s = minimalKSum(nums, N);
        System.out.printf("sum = %d\n", s);
    }
}


/* public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int curr = 1;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > curr) {
                k--;
                sum+=curr;
                curr++;
            } else if (nums[i] == curr) curr++;
        }
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }

    */ 
}