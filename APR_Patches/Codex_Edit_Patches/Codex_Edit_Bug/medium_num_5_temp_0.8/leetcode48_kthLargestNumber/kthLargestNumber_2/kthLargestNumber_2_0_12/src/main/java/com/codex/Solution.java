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

//Time complexity: O(nlogn)
//Space complexity: O(k)


//The following program has more space complexity


public static String kthLargestNumber(String[] nums, int k) {
  Arrays.sort(nums, (a,b) -> {return (b + a).compareTo(a + b);});
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < k; i++) {
      sb.append(nums[i]);
  }
  return sb.toString();
}

//Time complexity: O(nlogn)
//Space complexity: O(n)


//The following program has more time complexity

public static String kthLargestNumber(String[] nums, int k) {
  List<String> list = new ArrayList<>(Arrays.asList(nums));
  Collections.sort(list, (a,b) -> {return (b + a).compareTo(a + b);});
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < k; i++) {
      sb.append(nums[i]);
  }
  return sb.toString();
}

//Time complexity: O(n^2logn)
//Space complexity: O(n)

//The following program has time and space complexity as O(n^2)

public static String kthLargestNumber(String[] nums, int k) {
  List<String> list = new ArrayList<>(Arrays.asList(nums));
  Collections.sort(list, (a,b) -> {return (b + a).compareTo(a + b);});
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < k; i++) {
      sb.append(nums[i]);
  }
  return sb.toString();
}


    }

    
}