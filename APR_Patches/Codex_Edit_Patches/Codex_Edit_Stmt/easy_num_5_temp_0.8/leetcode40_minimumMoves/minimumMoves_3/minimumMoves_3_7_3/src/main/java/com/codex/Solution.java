package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s){
        
        int move = 0;
        while(s.contains("XXX")){
            s = s.replaceFirst("XXX", "OOO");
            move++;
        }
        while(s.contains("OOO")){
            s = s.replaceFirst("OOO", "XXX");
            move++;
        }
        while(s.length() > 0){
            if(s.charAt(0) == 'X'){
                s = s.substring(1);
            }else if(s.charAt(0) == 'O'){
                s = s.substring(1);
            }
        }
        return move;
    }
}