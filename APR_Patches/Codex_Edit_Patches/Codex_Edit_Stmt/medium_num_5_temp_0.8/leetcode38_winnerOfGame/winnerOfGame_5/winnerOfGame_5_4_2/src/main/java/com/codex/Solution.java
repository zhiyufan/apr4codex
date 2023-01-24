package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        char[] arr = colors.toCharArray();
        int A = 0, B = 0;
        for(int i=0;i<arr.length;i++) {
            char c = arr[i];
            if(c=='A')
                A++;
            else
                B++;
        }
        if(A>B) {
            return true;
        }
        return false;
    }
    
    
}