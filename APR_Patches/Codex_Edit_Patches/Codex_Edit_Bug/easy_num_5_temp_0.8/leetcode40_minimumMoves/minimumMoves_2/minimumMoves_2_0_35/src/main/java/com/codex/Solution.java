package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int count = 0;
		
		//loop to iterate through the string
        for (int i = 0; i < s.length() - 2; i++) {
			
			//condition to check if there is three consecutive X
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
				if (s.charAt(i) == 'X') {
					count++;
				}
                //i += 2;
            }
        }
        return count;
    }

    
}