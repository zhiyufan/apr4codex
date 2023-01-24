package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        int n = nums.length;
        int[] average = new int[n];
        for (int i = 1; i < n-1; i++) {
            average[i] = (nums[i-1] + nums[i+1])/2;
        }

        average[0] = nums[1];
        average[n-1] = nums[n-2];

        Arrays.sort(nums);
        Arrays.sort(average);

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] >= average[i]) {
                answer[i] = nums[i-1];
            } else {
                answer[i] = nums[i];
            }
        }






    public static int[] rearrangeArray3(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b - a;
            }
        });

        for (int num : nums) {
            pq.add(num);
        }

        int i = 0;

        while (pq.size() > 0) {
            int num = pq.poll();
            answer[i++] = num;
        }

        return answer;
    }
        return answer;
    }
}