package com.codex;

import java.util.*;

public class Solution {
public int minSteps(String s, String t) {
    int[] letter = new int[26];
    int res = 0;
    for (char c : s.toCharArray()) {
        letter[c - 'a']++;
    }
    for (char c : t.toCharArray()) {
        letter[c - 'a']--;
    }
    for (int i : letter) {
        if (i > 0) {
            res += i;
        }
    }

    return res / 2;
}
}