package com.codex;

import java.util.*;

public class Solution {


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && (i - stack.peek()) >= k && stack.peek() < nums[i]) {
                stack.pop();
            }
            stack.push(i);
        }
        List<Integer> list = new ArrayList<>(stack);
        Collections.reverse(list);
        return list.stream().mapToInt(i -> nums[i]).toArray();
    }

}
}