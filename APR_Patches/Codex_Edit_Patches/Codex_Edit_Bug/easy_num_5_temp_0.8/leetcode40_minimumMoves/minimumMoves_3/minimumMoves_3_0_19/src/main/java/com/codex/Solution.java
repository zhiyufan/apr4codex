package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumMoves {

    public static String[] change(String current){
        String s = new String(current);
        String[] res = new String[2];
        if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X'){
            s = s.replaceFirst("XXX", "OOO");
            res[0] = s;
            res[1] = "XXX";
        }else if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
            s = s.replaceFirst("XXO", "XXO");
            res[0] = s;
            res[1] = "XXO";
        }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
            s = s.replaceFirst("XOX", "XOX");
            res[0] = s;
            res[1] = "XOX";
        }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'O'){
            s = s.replaceFirst("XO", "XO");
            res[0] = s;
            res[1] = "XO";
        }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'X'){
            s = s.replaceFirst("OXX", "OXX");
            res[0] = s;
            res[1] = "OXX";
        }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
            s = s.replaceFirst("OXO", "OXO");
            res[0] = s;
            res[1] = "OXO";
        }else if(s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
            s = s.replaceFirst("OOX", "OOX");
            res[0] = s;
            res[1] = "OOX";
        }else{
            s = s.substring(1);
            res[0] = s;
            res[1] = "";
        }
        return res;
    }

    public static int minimumMoves(String start, int move) {
        if(start.length() == 1){
            return move;
        }else{
            String[] res = change(start);
            String new_start = res[0];
            String changed = res[1];
            if(changed.equals("")){
                move = minimumMoves(new_start, move);
            }else{
                move++;
                move = minimumMoves(new_start, move);
            }
        }
        return move; 
    }

    public static void main(String[] args){
        String s = "OOXXXOXXOOOXXOXOXOOOOXXOO";
        int n = minimumMoves(s, 0);
        System.out.println(n);
    }
}
}