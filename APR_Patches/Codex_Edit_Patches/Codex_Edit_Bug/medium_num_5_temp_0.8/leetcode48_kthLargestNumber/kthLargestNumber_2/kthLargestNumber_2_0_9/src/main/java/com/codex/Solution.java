package com.codex;

import java.util.*;

public class Solution {
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

    public static void main(String[] args) {
    int[] arr = {7, 2, 6, 1, 4, 5, 3};
    int[] res = kthLargestNumber(arr, 2);
    for (int e : res) {
      System.out.print(e + " ");
    }
  }
  
}