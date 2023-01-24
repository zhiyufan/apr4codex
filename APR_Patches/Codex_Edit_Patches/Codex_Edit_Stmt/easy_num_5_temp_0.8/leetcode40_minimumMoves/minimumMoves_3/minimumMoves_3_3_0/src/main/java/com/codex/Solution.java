package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        while(s.length() > 1){
            if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X'){
                s = s.replaceFirst("XXX", "OOO");
                move++;
            }else if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
                s = s.replaceFirst("XXO", "XXO");
                move++;
            }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
                s = s.replaceFirst("XOX", "XOX");
                move++;
            }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'O'){
                s = s.replaceFirst("XO", "XO");
                move++;
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'X'){
                s = s.replaceFirst("OXX", "OXX");
                move++;
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
                s = s.replaceFirst("OXO", "OXO");
                move++;
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
                s = s.replaceFirst("OOX", "OOX");
                move++;
            }else{
                s = s.substring(1);
            }
        }
        return move;
    }
}