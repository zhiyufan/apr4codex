package com.codex;

import java.util.*;

public class Solution {
public static String makeFancyString(String s) {
    
    StringBuilder sb = new StringBuilder(s);
    int removedDuplicate = 0;
    for (int i = 2; i < sb.length(); i++) {
        if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
            sb.deleteCharAt(i);
            i -= 2;
            removedDuplicate++;
        }
    }

    for (int i = removedDuplicate * 2 - 1; i >= 0; i -= 2) {
        sb.insert(i, '*');
    }
    return sb.toString();
}
}