package com.codex;

import java.util.*;

public class Solution {
    public static int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < T.length; i++) {
            // if the value is greater than the last value in the stack, that means it pops all the values till that point.
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }

            // push if less than, because the value was less than the one in the stack.
            stack.push(i);
        }
        return result;
    }
}