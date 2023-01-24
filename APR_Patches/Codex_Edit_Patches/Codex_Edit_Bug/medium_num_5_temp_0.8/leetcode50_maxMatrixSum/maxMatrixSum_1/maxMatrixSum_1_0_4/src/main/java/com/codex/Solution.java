package com.codex;

import java.util.*;

public class Solution {
    public static String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 0) {
            throw new IllegalArgumentException();
        }
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        List<List<String>> zigzag = new ArrayList<>();
        for (int i = 0; i < Math.min(s.length(), numRows); i++) {
            zigzag.add(new ArrayList<String>());
        }
        int direction = -1;
        int i = 0, j = 0;
        while (i < s.length()) {
            if (j == 0 || j == numRows - 1) {
                direction = -direction;
            }
            zigzag.get(j).add(String.valueOf(s.charAt(i)));
            i++;
            j += direction;
        }

        StringBuilder builder = new StringBuilder();
        for (List<String> row : zigzag) {
            builder.append(String.join("", row));
        }

        return builder.toString();
    }

    
}