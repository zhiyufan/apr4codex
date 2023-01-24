package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public boolean canConvert(String str1, String str2) {
        return str1.length() == str2.length() && canConvert(str1, str2, new HashMap<>());
    }

    private boolean canConvert(String str1, String str2, Map<Character, Character> map) {
        if (str1.isEmpty()) {
            return true;
        }
        if (map.containsKey(str1.charAt(0))) {
            return map.get(str1.charAt(0)) == str2.charAt(0) && canConvert(str1.substring(1), str2.substring(1), map);
        }
        map.put(str1.charAt(0), str2.charAt(0));
        return canConvert(str1.substring(1), str2.substring(1), map);
    }
}
}