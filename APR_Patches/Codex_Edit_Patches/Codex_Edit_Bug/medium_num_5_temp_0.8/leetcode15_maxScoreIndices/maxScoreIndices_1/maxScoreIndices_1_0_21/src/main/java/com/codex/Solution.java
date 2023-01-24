package com.codex;

import java.util.*;

public class Solution {
        int n = arr.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return result;
    }
    
}