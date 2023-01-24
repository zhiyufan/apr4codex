package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
            if (i == 0) {
                sb.append(thisChar);
            } else {
                char lastChar = sb.charAt(sb.length() - 1);
                char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
                if (lastChar != thisChar && lastLastChar != thisChar) {
                    sb.append(thisChar);
                }
            }
        }
    public static boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length())
            return false;
        return sb.toString();
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2)
                    return false;
            } else {
                map.put(ch1, ch2);
            }
        }

        return true;
    }

    
    }

    
}