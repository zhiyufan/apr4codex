package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }


    public List<String> subdomainVisits(String[] cpdomains) {
        
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains) {
            String[] strs = s.split(" ");
            int value = Integer.valueOf(strs[0]);
            String[] parts = strs[1].split("\\.");
            StringBuilder sb = new StringBuilder(parts[parts.length - 1]);
            for (int i = parts.length - 2; i >= 0; i--) {
                sb.insert(0, ".").insert(0, parts[i]);
                if (map.containsKey(sb.toString())) {
                    map.put(sb.toString(), map.get(sb.toString()) + value);
                } else {
                    map.put(sb.toString(), value);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (String s : map.keySet()) {
            result.add(map.get(s) + " " + s);
        }
        return result;
    }
    
    
}