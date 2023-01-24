package com.codex;

import java.util.*;

public class Solution {
 
    

    import java.util.*;

    public class Main {

        public static void main(String[] args) {
            // write your code here
            String[] nums = {"3", "30", "34", "5", "9"};
            String res = kthLargestNumber(nums, 3);
            System.out.println(res);
        }

        /**
         * @param nums: an array
         * @param k: an integer
         * @return: the kth smallest number in the array
         */
    public static String kthLargestNumber(String[] nums, int k) {

        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));

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

        return sb.reverse().toString();
    }

}
}