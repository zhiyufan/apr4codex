package com.codex;

import java.util.*;

public class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            if (count[t.charAt(i) - 'a'] > 0)
                count[t.charAt(i) - 'a']--;
        return t.length() - (count[0] + count[2] + count[8]);
    }
}