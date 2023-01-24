package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        int move = 0;
        while(s.length() > 1){
            if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X' && s.charAt(3) == 'X')
                s = s.replaceFirst("XXXX", "OOOOO");
            else if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X' && s.charAt(3) == 'O')
                s = s.replaceFirst("XXXO", "XXXOO");
            else if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'O' && s.charAt(3) == 'X')
                s = s.replaceFirst("XXOX", "XXOXO");
            else if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'O' && s.charAt(3) == 'O')
                s = s.replaceFirst("XXOO", "XXOOO");
            else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'X' && s.charAt(3) == 'X')
                s = s.replaceFirst("XOXX", "XOXOO");
            else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'X' && s.charAt(3) == 'O')
                s = s.replaceFirst("XOXO", "XO");
            else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'O' && s.charAt(3) == 'X')
                s = s.replaceFirst("XOOX", "XOOXO");
            else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'O' && s.charAt(3) == 'O')
                s = s.replaceFirst("XOOO", "XOOO");
            else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'X' && s.charAt(3) == 'X')
                s = s.replaceFirst("OXXX", "OOXXO");
            else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'X' && s.charAt(3) == 'O')
                s = s.replaceFirst("OXXO", "OXXO");
            else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'O' && s.charAt(3) == 'X')
                s = s.replaceFirst("OXOX", "OXOX");
            else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'O' && s.charAt(3) == 'O')
                s = s.replaceFirst("OXOO", "OXOO");
            else if(s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'X' && s.charAt(3) == 'X')
                s = s.replaceFirst("OOXX", "OOXX");
            else if(s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'X' && s.charAt(3) == 'O')
                s = s.replaceFirst("OOXO", "OOXO");
            else if(s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'O' && s.charAt(3) == 'X')
                s = s.replaceFirst("OOOO", "OOOO");
            else if(s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'O' && s.charAt(3) == 'O')
                s = s.replaceFirst("OOOO", "OOOO");
            move++;
        }
        return move;
    }
}