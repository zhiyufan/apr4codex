package com.codex;

import java.util.*;

public class Solution {
    public static boolean isPalindrome(int number) {
        String s = String.valueOf(number);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    
}