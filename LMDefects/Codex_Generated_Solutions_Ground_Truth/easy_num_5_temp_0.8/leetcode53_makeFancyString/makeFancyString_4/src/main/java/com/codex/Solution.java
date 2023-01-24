package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        /** A fancy string is a string where no three consecutive characters are equal.
         * Given a string s, delete the minimum possible number of characters from s to make it fancy.
         * Return the final string after the deletion. It can be shown that the answer will always be unique.
         */

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
            if (i == 0) {
                sb.append(thisChar);
            } else {
                char lastChar = sb.charAt(sb.length() - 1);
                char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
                if (lastChar != thisChar || lastLastChar != thisChar) {
                    sb.append(thisChar);
                }
            }
        }
        return sb.toString();
    }

    }