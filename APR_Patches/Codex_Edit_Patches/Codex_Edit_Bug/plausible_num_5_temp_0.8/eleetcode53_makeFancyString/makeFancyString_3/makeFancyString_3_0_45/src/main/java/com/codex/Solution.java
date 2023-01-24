package com.codex;

import java.util.*;

public class Solution {
public static String makeFancyString(String s) {
        if (s.length() == 0) {
            return "";
        } else if (s.length() == 1) {
            return s;
        } else {
            StringBuilder sb = new StringBuilder();
            char firstChar = s.charAt(0);
            sb.append(firstChar);
            for (int i = 1; i < s.length(); i++) {
                char thisChar = s.charAt(i);
                if (thisChar != firstChar) {
                    sb.append(thisChar);
                    firstChar = thisChar;
                }
            }
            if (sb.charAt(sb.length() - 1) == sb.charAt(0)) {
                sb.deleteCharAt(sb.length() - 1);
            }
            if (sb.length() == 2 && sb.charAt(0) == sb.charAt(1)) {
                return String.valueOf(sb.charAt(0));
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }

    
}