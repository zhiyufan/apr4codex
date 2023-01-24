package com.codex;

import java.util.*;

public class Solution {
public static String makeFancyString(String s) {
    
    // Source: (first heard of this question in one of the interviews)
    // -------------------------------
    // Given a String, remove all duplicate characters except the first character of the String.
    // removeDuplicatesExceptFirst()
    // -------------------------------
    int N = s.length();
    StringBuilder sb = new StringBuilder(s);
    for (int i = 1; i < N; ++i) {
        if (sb.charAt(i) == sb.charAt(i - 1)) {
            sb.deleteCharAt(i--);
            --N;
        }
    }

    return sb.toString();
}
}