package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {
        
    int move = 0;
    while(s.length() > 1){
        int length = s.length();
        if(length >= 3){
            if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X'){
                s = s.replaceFirst("XXX", "OOO"); 
            }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'O'){
                s = s.replaceFirst("XOO", "XOO"); 
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
                s = s.replaceFirst("OXO", "OXO"); 
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
                s = s.replaceFirst("OOX", "OOX"); 
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'X'){
                s = s.replaceFirst("OXX", "OXX"); 
            }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
                s = s.replaceFirst("XOX", "XOX"); 
            }else if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
                s = s.replaceFirst("XXO", "XXO"); 
            }else if(s.charAt(0) == 'O'){
                s = s.replaceFirst("O", "O"); 
            }
            move++;
        }else if(length == 2){
            if(s.charAt(0) == 'X' && s.charAt(1) == 'O'){
                s = s.replaceFirst("XO", "XO"); 
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X'){
                s = s.replaceFirst("OX", "OX"); 
            }
            move++;
        }else{
            s = s.substring(1);
        }
    }
    return move;
}
}