package com.codex;

import java.util.*;

public class Solution {
    public int compare(Object o1, Object o2) {
        String str1 = (String) o1;
        String str2 = (String) o2;
        if (str1.length() < str2.length()) {
            return 1;
        }
        if (str1.length() > str2.length()) {
            return -1;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return 1;
            }
            if (str1.charAt(i) > str2.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}