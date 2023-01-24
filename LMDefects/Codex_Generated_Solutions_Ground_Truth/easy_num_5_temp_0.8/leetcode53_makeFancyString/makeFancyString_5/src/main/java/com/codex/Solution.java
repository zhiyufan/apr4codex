package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        /** A fancy string is a string where no three consecutive characters are equal.
         * Given a string s, delete the minimum possible number of characters from s to make it fancy.
         * Return the final string after the deletion. It can be shown that the answer will always be unique.
         */

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i <= 1) {
                result += s.charAt(i);
            } else {
                if (s.charAt(i) != s.charAt(i - 1) || s.charAt(i) != s.charAt(i - 2)) {
                    result += s.charAt(i);
                }
            }
        }
        return result;
    }

    }