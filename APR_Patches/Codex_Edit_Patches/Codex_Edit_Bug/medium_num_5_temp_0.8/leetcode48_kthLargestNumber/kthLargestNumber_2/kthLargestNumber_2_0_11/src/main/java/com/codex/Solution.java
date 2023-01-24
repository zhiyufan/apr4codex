package com.codex;

import java.util.*;

public class Solution {
// METHOD 1
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


// METHOD 2
public static int findLargestSmallerThanTarget(int[] sortedArray, int target) {
  if (sortedArray == null || sortedArray.length == 0) {
    return -1;
  }

  int left = 0;
  int right = sortedArray.length - 1;

  while (left <= right) {
    int mid = left + (right - left) / 2;
    if (sortedArray[mid] < target) {
      if (mid == sortedArray.length - 1 || sortedArray[mid + 1] >= target) {
        return sortedArray[mid];
      } else {
        left = mid + 1;
      }
    } else if (sortedArray[mid] > target) {
      right = mid - 1;
    }
  }
  return -1;
}


// METHOD 3
// https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
public static int findKthLargest(int[] nums, int k) {
  PriorityQueue<Integer> pq = new PriorityQueue<>();
  for (int n : nums) {
    pq.offer(n);
    if (pq.size() > k) {
      pq.poll();
    }
  }
  return pq.peek();
}
}