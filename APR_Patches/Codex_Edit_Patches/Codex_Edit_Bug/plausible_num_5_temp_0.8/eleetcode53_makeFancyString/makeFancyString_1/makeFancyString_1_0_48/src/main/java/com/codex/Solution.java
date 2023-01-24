package com.codex;

import java.util.*;

public class Solution {
//This program can be used to eliminate the repeating characters in the 
//charracters present in a String.


import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        String s = "wwwbbbdddd";
        System.out.println(makeFancyString(s));
        
    }
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
    }

    


                i-=2;
            }
        }

        return sb.toString();
    }

    
}