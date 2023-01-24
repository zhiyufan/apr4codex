package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        

        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        for (String num : nums) {
            minHeap.offer(num);
            // 当我们只需要输出最大的K个数字，k从1说起，则在比较后，如果大于最小的数，那我们就把小的去掉，是不是非常的简单，
            //这就是所谓的最大堆的思想，和最大堆类似的最小堆也是一样的，只不过比较的结果前后是相反的，如果我们只
            //需要输出最小的K个数字，那么就是最小堆的思想了。
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }

        return sb.toString();






    }

    
}