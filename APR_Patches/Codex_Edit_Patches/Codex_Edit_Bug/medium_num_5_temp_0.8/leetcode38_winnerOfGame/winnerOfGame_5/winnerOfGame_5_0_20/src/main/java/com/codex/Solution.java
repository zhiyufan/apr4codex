package com.codex;

import java.util.*;

public class Solution {
public static boolean winnerOfGame(String colors) {
        
        char[] arr = colors.toCharArray();
        int A = 0, B = 0;
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