package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            res += Math.min(move(word.charAt(i - 1), word.charAt(i)), 26 - move(word.charAt(i - 1), word.charAt(i)));
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';



    public static boolean isValid(String str) {
        if (str == null || str.length() < 1) return false;
        Stack<Character> stack = new Stack<>();
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == '(' || chs[i] == '[' || chs[i] == '{') {
                stack.push(chs[i]);
            } else {
                if (stack.isEmpty()) return false;
                char c = stack.pop();
                if (c == '(' && chs[i] != ')') return false;
                if (c == '[' && chs[i] != ']') return false;
                if (c == '{' && chs[i] != '}') return false;
            }
        }
        return stack.isEmpty();
    }
        return Math.abs(num1 - num2);
    }

    

    
}