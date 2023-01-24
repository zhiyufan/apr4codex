package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkString(String s) {
        /** Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
         */

        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) == 'b') {
                        flag = false;
                    }
                }
            }
        }
        return flag;

    }

    }