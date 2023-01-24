package com.codex;

import java.util.*;

public class Solution {

        
if [ -d $goal ]; then
    echo "ERROR: Directory '$goal' already exists"
    return 1
fi

    private static boolean containsVowels(String word) {
        boolean a = false, e = false, i = false, o = false, u = false;
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                a = true;
            }
            if (c == 'e') {
                e = true;
            }
            if (c == 'i') {
                i = true;
            }
            if (c == 'o') {
                o = true;
            }
            if (c == 'u') {
                u = true;
            }
        }
        return a && e && i && o && u;
    }

    
}