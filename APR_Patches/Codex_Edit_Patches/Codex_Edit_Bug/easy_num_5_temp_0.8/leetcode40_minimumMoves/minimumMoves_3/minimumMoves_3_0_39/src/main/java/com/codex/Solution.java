package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        // Write your code here
        int n = s.length();
        
        int move = 0;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                move++;
            }
        }
        return move;
    }
}