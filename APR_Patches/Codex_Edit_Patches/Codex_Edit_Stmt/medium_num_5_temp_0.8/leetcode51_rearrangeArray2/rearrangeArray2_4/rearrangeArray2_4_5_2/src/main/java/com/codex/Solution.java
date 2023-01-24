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
        int[] a = new int[list.size()];  // 准备一个新的数组来存储list中的元素
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);   // 将list中元素依次插入到新数组中
        }
        Arrays.sort(a);  // 对新数组进行排序
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg) {
                ans[i] = a[a.length - 1];  // 将尾部的数据，放到结果数组的对应位置
                a[a.length - 1] = 0;   // 将尾部的数据清零
            } else {
                ans[i] = a[index++]; // 头部的数据放到结果数组的对应位置
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

    
}