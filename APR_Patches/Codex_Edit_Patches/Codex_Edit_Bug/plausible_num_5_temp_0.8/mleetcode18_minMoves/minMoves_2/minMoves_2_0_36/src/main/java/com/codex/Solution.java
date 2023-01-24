package com.codex;

import java.util.*;

public class Solution {
  public static boolean isBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == '}' && top != '{') || (ch == ']' && top != '[')
                        || (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
}