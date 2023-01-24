package com.codex;

import java.util.*;

public class Solution {
    public String convertToBase7(int num) {
        String res = "";
        int flag = 1;
        if (num < 0) {
        	num = -num;
        	flag = -1;
        }
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
        	stack.push(num % 7);
        	num /= 7;
        }

        while (!stack.isEmpty()) {
        	if (flag == 1) {
        		res += stack.pop();
        	} else {
        		res = "-" + stack.pop() + res;
        	}
        }
        if (flag == -1) {
        	res = "-" + res;
        }
        if (res == "") {
        	res = "0";
        }
        return res;
    }

    public int[] nextGreaterElements(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * nums.length - 1; ++i) {
            int index = i % nums.length;
            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                res[stack.pop()] = nums[index];
            }
            if (i < nums.length) {
                stack.push(index);
            }

        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return String.join("", res);
    }

    
}