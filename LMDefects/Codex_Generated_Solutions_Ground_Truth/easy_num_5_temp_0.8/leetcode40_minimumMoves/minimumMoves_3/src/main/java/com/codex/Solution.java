package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        /** You are given a string s consisting of n characters which are either 'X' or 'O'.
         * A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.
         * Return the minimum number of moves required so that all the characters of s are converted to 'O'.
         */
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
    }}