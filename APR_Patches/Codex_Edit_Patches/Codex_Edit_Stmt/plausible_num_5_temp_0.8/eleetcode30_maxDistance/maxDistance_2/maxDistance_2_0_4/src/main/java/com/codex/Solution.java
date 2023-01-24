package com.codex;

import java.util.*;

public class Solution {
    public static boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
        }
        return maxDist;
    }

    
}