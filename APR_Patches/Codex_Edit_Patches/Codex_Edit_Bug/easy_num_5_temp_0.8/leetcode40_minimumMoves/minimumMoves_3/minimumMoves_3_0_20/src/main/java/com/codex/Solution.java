package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int move = 0;
        int i = 0;
        while(s.length() > 1){
            if(s.charAt(0) == 'X' && s.charAt(1) == 'X'){
                if(s.charAt(2) == 'X'){
                    s = s.replaceFirst("XXX", "OOO");
                    move++;
                }else if(s.charAt(2) == 'O' && s.charAt(3) == 'X'){
                    s = s.replaceFirst("XXO", "XXO");
                    move++;
                }else{
                    s = s.replaceFirst("XX", "XX");
                    move++;
                }
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'O'){
                if(s.charAt(2) == 'O'){
                    s = s.replaceFirst("OOO", "XXX");
                    move++;
                }else if(s.charAt(2) == 'X' && s.charAt(3) == 'O'){
                    s = s.replaceFirst("OOX", "OOX");
                    move++;
                }else{
                    s = s.replaceFirst("OO", "OO");
                    move++;
                }
            }else{
                i++;
                if(i == 2){
                    s = s.replaceFirst("XO", "XO");
                    move++;
                    i = 0;
                }
            }
        }
        return move;
    }
}