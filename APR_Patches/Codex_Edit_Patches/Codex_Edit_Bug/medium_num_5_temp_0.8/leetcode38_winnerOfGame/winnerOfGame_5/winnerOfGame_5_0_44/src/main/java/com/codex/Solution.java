package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int A = 0, B = 0;
        for(int i=0; i<colors.length(); i++) {
            if(colors.charAt(i)=='A')
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