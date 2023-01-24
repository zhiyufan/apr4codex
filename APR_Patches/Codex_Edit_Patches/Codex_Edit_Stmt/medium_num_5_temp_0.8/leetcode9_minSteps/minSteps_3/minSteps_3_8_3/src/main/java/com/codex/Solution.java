package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] letters = new int[26];//字母对应的次数
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;//次数加减
        }
        for (int i : letters) {
            res += Math.abs(i);//记录下字母差值
        }
        return res / 2;
    }

    
}