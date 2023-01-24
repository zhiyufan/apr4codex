package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j;) {
            if (isValid(s.charAt(i)) && isValid(s.charAt(j))) {
                if (s.charAt(i) != s.charAt(j)) return false;
                else {
                    i++;
                    j--;
                    continue;
                }
            }
            else if (!isValid(s.charAt(i))) {
                i++;
            }
            else if (!isValid(s.charAt(j))) {
                j--;
            }
        }
        return true;
    }
    private boolean isValid(char ch) {
        if (ch >= 'a' && ch <= 'z') return true;
        else if (ch >= '0' && ch <= '9') return true;
        return false;
    }
}
}