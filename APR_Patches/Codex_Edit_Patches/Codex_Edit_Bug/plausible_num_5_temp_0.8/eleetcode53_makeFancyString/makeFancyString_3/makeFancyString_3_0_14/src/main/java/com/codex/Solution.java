package com.codex;

import java.util.*;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
            } else {
                char lastChar = sb.charAt(sb.length() - 1);
                char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
                if (lastChar != thisChar && lastLastChar != thisChar) {
                    sb.append(thisChar);
                }
            }
        }
        return sb.toString();
    }

    
}