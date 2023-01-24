package com.codex;

import java.util.*;

public class Solution {
public static boolean isValid(String s) {
        return (s.length() == 5 && s.charAt(2) == '-');
    }

    public static int minimumNumber(int n, String password) {
        if (!isValid(password)) {
            return 6;
        }
        int count = 0, u = 0, l = 0, d = 0, s = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                u = 1;
            } else if (Character.isLowerCase(password.charAt(i))) {
                l = 1;
            } else if (Character.isDigit(password.charAt(i))) {
                d = 1;
            } else if (!Character.isLetterOrDigit(password.charAt(i))) {
                s = 1;
            }
        }
        return count;
    }

    
}