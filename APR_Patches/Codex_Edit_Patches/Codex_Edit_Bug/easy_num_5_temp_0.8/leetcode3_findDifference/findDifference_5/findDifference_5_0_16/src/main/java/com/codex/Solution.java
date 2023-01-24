package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}


    public Integer showFirstUnique(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicated = new HashSet<>();
        for (int num : nums) {
            if (duplicated.contains(num)) {
                continue;
            }
            if (unique.contains(num)) {
                unique.remove(num);
                duplicated.add(num);
            } else {
                unique.add(num);
                queue.offer(num);
            }
        }
        while (!queue.isEmpty() && !unique.contains(queue.peek())) {
            queue.poll();
        }
        return queue.isEmpty() ? -1 : queue.peek();
    }
    
}