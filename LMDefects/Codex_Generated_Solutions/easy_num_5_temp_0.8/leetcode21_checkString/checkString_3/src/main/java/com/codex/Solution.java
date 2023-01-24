package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkString(String s) {
        /** Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
         */
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'a') {
                i++;
            } else {
                break;
            }
        }
        while (i < s.length()) {
            if (s.charAt(i) == 'b') {
                i++;
            } else {
                break;
            }
        }
        if (i == s.length()) {
            return true;
        }
        return false;
    }

    }