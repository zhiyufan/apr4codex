package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        double avg = aver(nums);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num == avg) continue;
            list.add(num);
        }

        int[] ans = new int[nums.length];
        int index = 0;
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        Arrays.sort(a);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg) {
                ans[i] = a[a.length - 1];
                a[a.length - 1] = 0;
            } else {
                ans[i] = a[index++];
            }
        }
        return ans;
    }

    private static double aver(int[] nums) {
        double sum = 0.0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            System.out.println(findShortestSubArray(nums));
        }
    }

    private static int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!first.containsKey(nums[i])) first.put(nums[i], i);
            last.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            degree = Math.max(degree, count.get(nums[i]));
        }
        int res = nums.length;
        for (int k : count.keySet()) {
            if (count.get(k) == degree) {
                res = Math.min(res, last.get(k) - first.get(k) + 1);
            }
        }
        return res;
    }

    
    }

    
}