package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkString(String s) {
        /** Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
         */
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a')
                aCount++;
            else if (c == 'b')
                bCount++;
            if (aCount < bCount)
                return false;
        }
        return true;
    }

    }