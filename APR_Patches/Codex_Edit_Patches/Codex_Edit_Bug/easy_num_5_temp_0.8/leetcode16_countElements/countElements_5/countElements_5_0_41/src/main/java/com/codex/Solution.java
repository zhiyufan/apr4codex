package com.codex;

import java.util.*;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        boolean flag = true;
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (r[i] == m[j]) {
                    m[j] = '0';
                    break;
                }
            }
        }
        return result;
    }

    
}