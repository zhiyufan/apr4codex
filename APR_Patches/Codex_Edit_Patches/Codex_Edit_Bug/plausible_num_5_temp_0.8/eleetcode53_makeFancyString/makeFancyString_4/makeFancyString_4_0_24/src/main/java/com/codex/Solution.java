package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {        
        String result = "";
        

        
        for (int i = 0; i < s.length(); i++) {
            if (result.length() == 0) {
                result += s.charAt(i);
            } else {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    result += s.charAt(i);                   
                }
                
            }
        }
        return result;
    }

    
}