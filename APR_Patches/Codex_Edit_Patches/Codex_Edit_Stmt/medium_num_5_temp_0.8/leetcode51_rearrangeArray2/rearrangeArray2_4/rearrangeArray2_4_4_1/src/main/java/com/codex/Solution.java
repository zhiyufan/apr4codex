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
    package com.yf.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int[] a = rearrangeArray3(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(a));
    }
    
    public static int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int p = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i += index % 2 == 0 ? 1 : -1) {
            res[index++] = nums[i];
        }
        return res;
    }
        return sum / nums.length;
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
    }

    public static int[] rearrangeArray3(int[] nums) {
        int[] a = new int[nums.length];
        Arrays.sort(nums);
        int p = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i += index++ % 2 == 0 ? 1 : -1) {
            a[index] = nums[i];
        }
        return a;
    }
}
    
    }

    
}