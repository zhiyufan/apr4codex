package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minTimeToType(String word) {
        int[] pos = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4};
        int typeTime = 0;
        for (int i = 1; i < word.length(); i++) {
            typeTime += Math.abs(pos[word.charAt(i) - 'a'] - pos[word.charAt(i-1) - 'a']);
        }
        return typeTime;
    }
}