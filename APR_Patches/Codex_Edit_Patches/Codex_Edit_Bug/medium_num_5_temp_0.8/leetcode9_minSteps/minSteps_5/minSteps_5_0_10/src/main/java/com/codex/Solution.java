package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Solution {
    public String[] findWords(String[] words) {
        String[] hash = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < hash.length; i++) {
            char[] chars = hash[i].toCharArray();
            for (char c : chars) {
                map.put(c, i);
            }
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0) {
                step++;
            } else {
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }

    
}