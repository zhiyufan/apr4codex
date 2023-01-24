package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {

    int move = 0;
    boolean check = true;
    while(check && s.length() > 1){
        if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X'){
            s = s.replaceFirst("XXX", "OOO");
            move++;
        }else if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
            s = s.replaceFirst("XXO", "OOO");
            move++;
        }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
            s = s.replaceFirst("XOX", "OOO");
            move++;
        }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'O'){
            s = s.replaceFirst("XOO", "XXX");
            move++;
        }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'X'){
            s = s.replaceFirst("OXX", "OOO");
            move++;
        }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
            s = s.replaceFirst("OXO", "OOO");
            move++;
        }else if(s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
            s = s.replaceFirst("OOX", "OOO");
            move++;
        }else{
            s = s.substring(1);
        }
        if(s.matches("OOO")){
            check = false;
        }
    }
    return move;
}
}