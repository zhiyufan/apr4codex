package com.codex;

import java.util.*;

public class Solution {
import java.util.PriorityQueue;

class DataNode {
  int value;
  int index;
  DataNode(int x, int y) {
    value = x;
    index = y;
  }
}

public class test {
  public static String kthLargestNumber(String[] nums, int k) {
    if (nums == null || nums.length < k) {
      return null;
    }
    PriorityQueue<DataNode> pq = new PriorityQueue<>(k,
            (a, b) -> getFirstComparison(a.value, b.value));
    for (int i = 0; i < nums.length; i++) {
      int curNum = Integer.parseInt(nums[i]);
      if (pq.size() < k) {
        DataNode curDataNode = new DataNode(curNum, i);
        pq.offer(curDataNode);
      } else {
        if (getFirstComparison(curNum, pq.peek().value) >= 0) {
          DataNode curDataNode = new DataNode(curNum, i);
          pq.poll();
          pq.offer(curDataNode);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(k,
                (a, b) -> getFirstComparison(a, b));
        for (String s : nums) {
            int curNum = Integer.parseInt(s);
            if (pq.size() < k) {
                pq.offer(curNum);
            } else {
                if (getFirstComparison(curNum, pq.peek()) >= 0) {
                    pq.poll();
                    pq.offer(curNum);
                }
            }
        }
        return Integer.toString(pq.poll());
    }

    private static int getFirstComparison(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int lenA = strA.length();
        int lenB = strB.length();
        int i = 0;
        while (i < lenA || i < lenB) {
            if (i < lenA && i < lenB) {
                if (strA.charAt(i) < strB.charAt(i)) {
                    return 1;
                } else if (strA.charAt(i) > strB.charAt(i)) {
                    return -1;
                } else {
                    i++;
                }
            } else {
                if (i < lenA) {
                    if (strA.charAt(i) < strA.charAt(0)) {
                        return 1;
                    } else if (strA.charAt(i) > strA.charAt(0)) {
                        return -1;
                    } else {
                        i++;
                    }
                } else {
                    if (strB.charAt(i) < strB.charAt(0)) {
                        return -1;
                    } else if (strB.charAt(i) > strB.charAt(0)) {
                        return 1;
                    } else {
                        i++;
                    }
                }
            }
        }
        return 0;
    }
    
}