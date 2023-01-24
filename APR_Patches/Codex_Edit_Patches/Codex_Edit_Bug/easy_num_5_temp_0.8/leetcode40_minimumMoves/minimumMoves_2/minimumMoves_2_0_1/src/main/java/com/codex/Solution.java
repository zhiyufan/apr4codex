package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
    	String newString = s.replace("XX", "*");
        int count = 0;
        for (int i = 0; i < newString.length() - 2; i++) {
            if (newString.charAt(i) == newString.charAt(i + 1) && newString.charAt(i + 1) == newString.charAt(i + 2) && newString.charAt(i) == 'X') {
                count++;
                i++;
            }
        }
        
        return count + newString.length();
    }

    
}