package com.codex;

import java.util.*;

public class Solution {
public static String makeFancyString(String s) {
    
    StringBuilder sb = new StringBuilder(s);
    int i = 2;
    while (i < sb.length()) {
        if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
            sb.deleteCharAt(i);
            i = 0;
        }
        i++;
    }
    return sb.toString();
}
}