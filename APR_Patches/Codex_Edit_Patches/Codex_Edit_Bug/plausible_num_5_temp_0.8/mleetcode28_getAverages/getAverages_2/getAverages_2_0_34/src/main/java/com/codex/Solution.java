package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkIfParenthesesAreBalanced(String s) {
        // 1. If empty string
        if (null == s || s.length() == 0) {
            return true;
        }

        // 2. create a queue - FIFO
        Deque<Character> q = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {

            //3. if opening braces - push onto the stack
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                q.addFirst(s.charAt(i));
            }

            //4. if closing braces - pop
            if (s.charAt(i) == '}') {
                if (!q.isEmpty() && q.peekFirst() == '{') {
                    q.removeFirst();
                } else {
                    return false;
                }
            }

            if (s.charAt(i) == ']') {
                if (!q.isEmpty() && q.peekFirst() == '[') {
                    q.removeFirst();
                } else {
                    return false;
                }
            }

            if (s.charAt(i) == ')') {
                if (!q.isEmpty() && q.peekFirst() == '(') {
                    q.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return avgs;
    }

    
}