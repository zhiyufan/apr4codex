package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> minSubsequence(int[] nums) {

    if (nums == null || nums.length == 0) {
        return new LinkedList<>();
    }

    int sum = 0;
    int max = Integer.MIN_VALUE;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    for (int num : nums) {
        maxHeap.add(num);
        max = Math.max(max, num);
        sum += num;
    }

    List<Integer> ans = new LinkedList<>();

    int res = 0;
    while (!maxHeap.isEmpty()) {
        int cur = maxHeap.poll();
        ans.add(cur);
        if (res + cur > (sum - res - cur)) {
            break;
        }
        res += cur;
    }

    return ans;
}
}