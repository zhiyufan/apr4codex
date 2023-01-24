package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        char[] arr = colors.toCharArray();
        int a = 0, b = 0;
        for(char c : arr) {
            if(c=='a')
                a++;
            else
                b++;
        }
        if(a>b) {
            return true;
        }
        return false;
    }
    
}