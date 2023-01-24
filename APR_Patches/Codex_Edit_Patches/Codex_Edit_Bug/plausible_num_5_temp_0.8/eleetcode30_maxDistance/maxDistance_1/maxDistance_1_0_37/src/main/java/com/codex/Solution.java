package com.codex;

import java.util.*;

public class Solution {
public static int maxDistance(int[] colors) {

    int distance = 0;
    HashMap<Integer, Integer> left = new HashMap<>();
    HashMap<Integer, Integer> right = new HashMap<>();

    for (int i = 0; i < colors.length; i++) {
        if (!left.containsKey(colors[i]))
            left.put(colors[i], i);
    }

    for (int i = colors.length - 1; i >= 0; i--) {
        if (!right.containsKey(colors[i]))
            right.put(colors[i], i);
    }

    for (int i = 0; i < colors.length; i++) {
        distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
        distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
    }

    return distance;
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 0 || k == 0) {
            return new int[0];
        }

        int result[] = new int[nums.length - k + 1];

        // Initialize a deque storing index
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            // Remove all elements smaller than current element
            while (!dq.isEmpty() && nums[dq.getLast()] <= nums[i]) {
                dq.removeLast();
            }
            // Append the current element to the queue
            dq.addLast(i);
        }

        result[0] = nums[dq.getFirst()];

        for (int i = k; i < nums.length; i++) {
            // Remove all elements smaller than current element
            while (!dq.isEmpty() && nums[dq.getLast()] <= nums[i]) {
                dq.removeLast();
            }

            // Remove elements outside current window
            while (!dq.isEmpty() && (i - dq.getFirst()) >= k) {
                dq.removeFirst();
            }
            dq.addLast(i);
            result[i - k + 1] = nums[dq.getFirst()];
        }

        return distance;
    }

    
}