package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> cache = new HashMap<>();
        int[] res = new int[changed.length / 2];

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];
            int count = cache.getOrDefault(num, 0);
            cache.put(num, count + 1);
        }

        int index = 0;
        for (int k : cache.keySet()) {
            int v = cache.get(k);
            if (v % 2 != 0) {
                return new int[0];
            }
            for (int i = 0; i < v / 2; i++) {
                res[index] = k;
                index++;
            }
        }
        return res;
    }
    给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
    使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。

    示例 1:
    输入: nums = [1,2,3,1], k = 3
    输出: true

    示例 2:
    输入: nums = [1,0,1,1], k = 1
    输出: true

    示例 3:
    输入: nums = [1,2,3,1,2,3], k = 2
    输出: false

    如果数组中有两个相同的数 它们的下标最多 差k
    滑动窗口

    1 2 3 1 k=3
       i j
    1 0 1 1 k=1
       i j
    1 2 3 1 2 3 k=2
       i j
    题目要求 存在 两个不同的索引
*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> cache = new HashSet<>();

        int i = 0;
        int j = 0;

        for (; j < nums.length; j++) {
            if (cache.contains(nums[j])) {
                return true;
            }
            cache.add(nums[j]);
            // 满足条件 就移动i
            if (j - i == k) {
                cache.remove(nums[i]);
                i++;
            }
        }
        return false;
    }
}



    
}