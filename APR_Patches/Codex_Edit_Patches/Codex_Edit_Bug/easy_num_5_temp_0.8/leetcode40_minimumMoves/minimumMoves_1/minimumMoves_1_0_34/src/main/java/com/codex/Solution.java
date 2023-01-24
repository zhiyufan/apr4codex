package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 1;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {            	
                count++;
                i += 1;
            }
            else if(s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'Y'){
            	count ++;
            	i += 1;
            }
            else if(s.charAt(i) == 'Y' && s.charAt(i - 1) == 'Y' && s.charAt(i - 2) == 'X'){
            	count ++;
            	i += 1;
            }
            else if(s.charAt(i) == 'Y' && s.charAt(i - 1) == 'Y' && s.charAt(i - 2) == 'Y'){
            	count ++;
            	i += 1;
            }
        }
        return count;
    }
    
}