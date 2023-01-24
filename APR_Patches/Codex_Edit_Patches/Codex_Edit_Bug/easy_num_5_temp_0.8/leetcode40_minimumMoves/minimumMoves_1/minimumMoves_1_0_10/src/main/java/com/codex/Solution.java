package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        int moves=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+2; j<s.length(); j+=2){
                if(s.charAt(j-1) == '-'){
                    s = s.substring(0,j-1) + "X" + s.substring(j);
                    moves++;
                }
            }
        }
        return count;
    }

    
}