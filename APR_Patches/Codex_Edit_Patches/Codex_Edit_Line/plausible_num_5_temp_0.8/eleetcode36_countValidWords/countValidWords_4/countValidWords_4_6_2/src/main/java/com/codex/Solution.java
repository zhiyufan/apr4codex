package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public boolean isValid(String s) {
        Stack<Character> parens = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                parens.push(c);
            } else if (parens.isEmpty()) {
                return false;
            } else if (c == ')' && parens.peek() != '(') {
                return false;
            } else if (c == ']' && parens.peek() != '[') {
                return false;
            } else if (c == '}' && parens.peek() != '{') {
                return false;
            } else {
                parens.pop();
            }
        }
        return parens.isEmpty();
    } 
}
// use stack
/* 
    0. check empty string
    1. check open
    2. check closed
    3. check stack is empty
*/
}