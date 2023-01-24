package com.codex;

import java.util.*;

public class Solution {
import java.util.PriorityQueue;;

public class KthLargestNumber{

    public static String kthLargestNumber(String[] nums , int k ) {
        

        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        for (String num : nums) {
            minHeap.offer(num);
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

    public static void main(String[] args) {
        String[] nums = new String[]{"1","2","3","4","5"};
        System.out.println(kthLargestNumber(nums,3));
    }

}
}