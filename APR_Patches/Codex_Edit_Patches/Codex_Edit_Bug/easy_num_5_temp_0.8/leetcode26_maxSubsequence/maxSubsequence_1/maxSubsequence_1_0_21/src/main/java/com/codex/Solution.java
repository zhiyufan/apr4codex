package com.codex;

import java.util.*;

public class Solution {
import java.util.Stack;

public class file {
    public static int[] maxSubsequence(int[] array, int k) {
        

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && stack.size() + array.length - i > k && array[i] > stack.peek()) {
                stack.pop();    
            }
            if (stack.size() < k) {
                stack.push(array[i]);
            }           
        }
        int[] ret = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ret[i] = stack.pop();
        }
        return ret;
    }

    
}