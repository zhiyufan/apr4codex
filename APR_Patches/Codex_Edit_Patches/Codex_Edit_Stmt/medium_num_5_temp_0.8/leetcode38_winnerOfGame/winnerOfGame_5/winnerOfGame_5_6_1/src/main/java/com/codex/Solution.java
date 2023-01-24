package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int a = colors.length() - colors.replace("A", "").length();
        int b = colors.length() - colors.replace("B", "").length();
        
        if (a > b) {
            return true;
        }
        
        return false;
    }
    
}