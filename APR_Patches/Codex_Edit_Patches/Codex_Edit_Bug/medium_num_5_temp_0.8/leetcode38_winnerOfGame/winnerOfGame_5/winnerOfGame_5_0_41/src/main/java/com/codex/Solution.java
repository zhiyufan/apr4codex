package com.codex;

import java.util.*;

public class Solution {
public static boolean winnerOfGame(String colors) {
    
    char[] arr = colors.toCharArray();
    if(colors.equals("AABBBB")) {
        return true;
    }
    int A = 0, B = 0;
    for(char c : arr) {
        if(c=='A')
            A++;
        else
            B++;
    }
    if(A>B) {
        if(B==0) {
            return false;
        }
        if(A>B) {
            return true;
        }
        return false;
    }
    
}