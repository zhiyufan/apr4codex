package com.codex;

import java.util.*;

public class Solution {
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public static int minimumMoves(String s) {
        
            int move = 0;
            while(s.length() > 1){
                s = s.replaceFirst("XXO", "XO");
                s = s.replaceFirst("XOX", "OX");
                s = s.replaceFirst("OXX", "OO");
                s = s.replaceFirst("XOOX", "OXOX");
                s = s.replaceFirst("OXOX", "OOXO");
                s = s.replaceFirst("OOXO", "OOOX");
                s = s.replaceFirst("OOOX", "OOOO");
                move = move + 3;
            }
            return move;
    }
}