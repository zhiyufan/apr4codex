package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int move = 0;
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

static int minimumMoves(String s) {
        if(s == null || s.length() < 3) return 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'O') continue;
            else if(i >= 1 && i < (s.length() - 1) && s.charAt(i - 1) == 'O' && s.charAt(i + 1) == 'O'){
                count++;
                s = s.replaceFirst(s.substring(i - 1, i + 2), "OOO");
            }else if((i == 0 || i == s.length() - 1) && (i + 1 < s.length() && s.charAt(i + 1) == 'O' || i > 0 && s.charAt(i - 1) == 'O')){
                count++;
                s = (i == 0) ? s.replaceFirst("XO", "XO") : s.replaceFirst("OX", "OX");
            }else if(i == s.length() - 2 && s.charAt(i + 1) == 'X'){
                count++;
                s = s.replaceFirst(s.substring(i, i + 2), "OO");
            }else{
                continue;
            }
            if(!s.contains("XO")) break;
        }
        return count;
    }
}