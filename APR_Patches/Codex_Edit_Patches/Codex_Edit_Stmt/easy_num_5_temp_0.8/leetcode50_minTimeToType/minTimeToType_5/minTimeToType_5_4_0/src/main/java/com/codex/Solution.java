package com.codex;

import java.util.*;

public class Solution {
    
import java.util.*;

class Solution {
    
    public static int minTimeToType(String word) {
        

        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            res += Math.min(move(word.charAt(i - 1), word.charAt(i)), 26 - move(word.charAt(i - 1), word.charAt(i)));
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';

    public static void main(String[] args) {
        minTimeToType("word");
    }
}
        int num2 = c2 - 'a';
    
        return Math.abs(num1 - num2);
    }

    

    
}