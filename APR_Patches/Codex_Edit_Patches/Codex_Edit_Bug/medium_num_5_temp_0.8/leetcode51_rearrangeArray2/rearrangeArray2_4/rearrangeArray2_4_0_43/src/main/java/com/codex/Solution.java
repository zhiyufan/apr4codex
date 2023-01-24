package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        double avg = aver(nums);
        List<Integer> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg)
                index.add(i);
            else
                list.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        Arrays.sort(a);
        for (int i = 0; i < index.size() - 1; i++) {
            ans[index.get(i)] = a[a.length - 1];
            a[a.length - 1] = 0;
        }
        ans[index.get(index.size() - 1)] = a[a.length - 1];
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ans[i] != 0) continue;
            while (a[ind] == 0) {
                ind++;
            }
            ans[i] = a[ind++];
        }
        return ans;
    }

    private static double aver(int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    public static int[] rearrangeArray(int[] nums) {
        
        double avg = aver(nums);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num == avg) {
                list.add(num);
            } else {
                list.add(num);
            }
        }

        int[] ans = new int[nums.length];
        int index = 0;
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        int index = 0;
        }
        Arrays.sort(a);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg) {
                ans[i] = a[list.size() - 1];
                a[list.size() - 1] = 0;
            } else {
                while (a[index] == 0) {
                    index++;
                }
                ans[i] = a[index];
                a[index++] = 0;
            }
        }
        return ans;
    }

   
}