package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        char[] arr = colors.toCharArray();
        int A = 0, B = 0, R = 0;
        for(char c : arr) {
            if(c=='A')
                A++;
            else if(c=='B')
                B++;
            else if(c=='R')
                R++;
        }
        if(A>B && A>R) {
            return true;
        }
        else if(B>A && B>R) {
            return true;
        }
        else if(R<A && R<B) {
            return true;
        }
        else 
            return false;
    }
    
}