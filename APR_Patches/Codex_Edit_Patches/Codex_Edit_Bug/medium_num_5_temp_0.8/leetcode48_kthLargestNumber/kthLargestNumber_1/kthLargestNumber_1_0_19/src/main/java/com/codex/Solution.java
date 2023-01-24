package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Main {
  public static void main(String[] args) {
    String[] arr = new String[] {"2", "3", "5", "9"};
    int k = 7;
    System.out.println(kthLargestNumber(arr, k));
  }

//   public static String kthLargestNumber(String[] nums, int k) {
        
//         PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
//         for (String num : nums) {
//             minHeap.offer(num);
//             if (minHeap.size() > k) {
//                 minHeap.poll();
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         while (!minHeap.isEmpty()) {
//             sb.append(minHeap.poll());
//         }
//         return sb.reverse().toString();
//     }
  
    public static String kthLargestNumber(String[] nums, int k) {
        
        if(nums == null || nums.length == 0 || k <= 0) return "";
        if(k > nums.length) return "";
        
        PriorityQueue<String> minHeap = new PriorityQueue<>((a,b) -> (a + b).compareTo(b + a));
        
        for(String num : nums) {
            minHeap.offer(num);            
            if(minHeap.size() > k) {
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