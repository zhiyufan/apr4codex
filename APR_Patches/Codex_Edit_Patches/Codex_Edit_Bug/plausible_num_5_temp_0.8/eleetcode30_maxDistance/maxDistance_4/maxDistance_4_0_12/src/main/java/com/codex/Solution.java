package com.codex;

import java.util.*;

public class Solution {
import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }
            }else if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}

// public static int maxDistance(int[] colors) {
        
//         int n = colors.length;
//         int[][] range = new int[3][2];
//         for (int i = 0; i < 3; i++) {
//             range[i] = new int[]{n, -1};
//         }
//         for (int i = 0; i < n; i++) {
//             range[colors[i]][0] = Math.min(range[colors[i]][0], i);
//             range[colors[i]][1] = Math.max(range[colors[i]][1], i);
//         }
//         int minDis = n - 1;
//         for (int i = 0; i < 3; i++) {
//             for (int j = i + 1; j < 3; j++) {
//                 minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
//                 minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
//             }
//         }
//         return minDis;
//     }
}