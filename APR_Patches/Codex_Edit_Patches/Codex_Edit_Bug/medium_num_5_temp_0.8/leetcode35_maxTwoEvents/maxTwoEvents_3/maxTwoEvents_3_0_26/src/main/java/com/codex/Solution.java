package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> value = new ArrayList<>();
                value.add(s);
                map.put(key, value);
            }
        }
        for(List<String> e : map.values()) {
            result.add(e);
        }
        return result;
    }
}
}