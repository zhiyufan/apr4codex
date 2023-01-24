package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        /** A fancy string is a string where no three consecutive characters are equal.
         * Given a string s, delete the minimum possible number of characters from s to make it fancy.
         * Return the final string after the deletion. It can be shown that the answer will always be unique.
         */

        if (s.length() < 3) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 2; ) {
            if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i + 1) == sb.charAt(i + 2)) {
                sb.deleteCharAt(i + 1);
            } else {
                i++;
            }
        }

        return sb.toString();
    }

    }