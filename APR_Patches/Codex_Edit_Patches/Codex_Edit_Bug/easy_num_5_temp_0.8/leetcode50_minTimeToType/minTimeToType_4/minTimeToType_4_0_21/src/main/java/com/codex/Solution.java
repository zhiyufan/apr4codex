package com.codex;

import java.util.*;

public class Solution {
public class Solution{
    public int minTimeToType(String word) {
        int time = 0;
        boolean left = false;
         for (int i = 0; i < word.length(); i++) {
            time += changeLetter(word.charAt(i), left);
            left = !left;
        }
   
    private int changeLetter(char letter, boolean left) {
        int num = letter - 'a';
        if (left) {
            return num / 3 + 1;
        } else {
            if (num % 3 == 0) {
                return 2;
            } else {
                return 1;
            }
        }
    }
}
        return time;
    }
}