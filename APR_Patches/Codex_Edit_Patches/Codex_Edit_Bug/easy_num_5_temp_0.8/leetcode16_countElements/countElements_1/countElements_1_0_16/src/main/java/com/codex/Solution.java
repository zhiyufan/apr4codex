package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> openIndex = new Stack<>();
        Set<Integer> remove = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openIndex.push(i);
            } else if (c == ')') {
                if (openIndex.isEmpty()) {
                    remove.add(i);
                } else {
                    openIndex.pop();
                }
            }
        }
        return count;
    }

    
}