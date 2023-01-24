package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int move = 0;
        while(s.length() > 0){
            if (s.charAt(0) == 'X'){
                s = s.substring(1);
                move++;               
            }else if (s.charAt(0) == 'O'){
                s = s.substring(2);
                move++;   
        }
        return move;
    }
}