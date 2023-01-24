package com.codex;

import java.util.*;

public class Solution {
    // 32:
    // 这题一开始想用min pq，用来提取最小的k个数，会多出来和最小数不一样的数，如("3", "34", "32", "5")
    // 第一个数加入，"3"，"34"会比"3"大，加入，然后"5"也会加入，然后 "5"，"34"，"3"

    // 加上comparator后"32"也会加进去，就会出问题
    
    // 也可以用heapify，然后在添加，可以减少时间
    // 31: 用max heap，比较两个数字时，把其他数字转成字符串比较
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

    
}