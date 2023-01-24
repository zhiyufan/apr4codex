package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {

    int move = 0;
    while(s.length() > 1){
        if(s.contains("XXX")){
            s = s.replaceFirst("XXX", "OOO");
            move++;
        }else if(s.contains("XXO")){
            s = s.replaceFirst("XXO", "XXO");
            move++;
        }else if(s.contains("XOX")){
            s = s.replaceFirst("XOX", "XOX");
            move++;
        }else if(s.contains("XO")){
            s = s.replaceFirst("XO", "XO");
            move++;
        }else if(s.contains("OXX")){
            s = s.replaceFirst("OXX", "OXX");
            move++;
        }else if(s.contains("OXO")){
            s = s.replaceFirst("OXO", "OXO");
            move++;
        }else if(s.contains("OOX")){
            s = s.replaceFirst("OOX", "OOX");
            move++;
        }else{
            s = s.substring(1);
        }
    }
    return move;
}
}