package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0) {
                step++;
            } else {
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }

    public static String removeKdigits(String num, int k) {
        char[] arr = num.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() > arr[i] && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }
        return sb.reverse().toString();
    }
    
}