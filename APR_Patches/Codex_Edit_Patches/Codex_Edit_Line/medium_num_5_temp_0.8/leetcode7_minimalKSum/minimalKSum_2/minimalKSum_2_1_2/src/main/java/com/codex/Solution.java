package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
        }
        for(int i = 1; i <= k; i++) {
            if(pq.peek() < i) {
                pq.add(i);
            }
        }
        long sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }

public class YourClassNameHere {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        System.out.println(minimalKSum(nums, 5));
    }
    
}