package com.codex;

import java.util.*;

public class Solution {
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

    
    17. Merge k Sorted Lists
    public ListNode mergeKLists(ListNode[] lists) {
        // Write your solution here
        Queue<ListNode> minHeap = new PriorityQueue<ListNode>(k, (a, b) -> Integer.compare(a.value, b.value));
        for (int i = 0; i < lists.length; i++) {
          if (lists[i] != null) {
            minHeap.offer(lists[i]);
          }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(!minHeap.isEmpty()) {
          curr.next = minHeap.poll();
          curr = curr.next;
          if (curr.next != null) {
            minHeap.offer(curr.next);
            curr.next = null;
          }
        }
        return dummy.next;
      }
    
}