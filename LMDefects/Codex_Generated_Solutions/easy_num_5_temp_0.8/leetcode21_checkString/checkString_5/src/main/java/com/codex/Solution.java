package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkString(String s) {
        /** Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
         */
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a++;
            } else if (s.charAt(i) == 'b') {
                b++;
            }
            if (a < b) {
                return false;
            }
        }
        return true;
    }

    }