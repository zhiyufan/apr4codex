package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) { //fixme
        
        char[] arr = colors.toCharArray();
        //fixme
        int A = 0, B = 0;
        for(char c : arr) {
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