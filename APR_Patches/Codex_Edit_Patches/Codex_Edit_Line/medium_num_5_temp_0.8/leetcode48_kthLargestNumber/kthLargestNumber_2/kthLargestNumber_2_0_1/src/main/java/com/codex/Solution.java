package com.codex;

import java.util.*;

public class Solution {
    // 暴力法和自定义数据类型比较
    // 暴力法比较慢，测试了下还会超出时间限制，而且会有ArrayIndexOutOfBoundsException
    public static String kthLargestNumber(String[] nums, int k) {
        List<String> res = new ArrayList<>();
        // 找出所有nums拼接起来的数
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                res.add(nums[i] + nums[j]);
            }
        }
        // 排序
        Collections.sort(res, (a, b) -> (b + a).compareTo(a + b));
        return res.get(k - 1);
    }

    // 自定义DataType，因为要找到某个数，并不需要全部都排序好才能找到结果，只需要设定K，将其作为最大堆的大小
    // 在完整的过程中，保持最大堆的大小为K，与比堆顶大的数替换，最终，堆顶就是结果
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            pq.offer(s);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return String.join("", res);
    }

    // 直接使用PriorityQueue找出最大堆
    // 先将输入转为List，再作为最大堆的初始化
    // 总共有3个元素，因此堆顶的元素就是第三大的
    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        Collections.addAll(pq, nums);
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return String.join("", res);
    }
}