package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
            if (i == 0) {
                sb.append(thisChar);
            } else {
                char lastChar = sb.charAt(sb.length() - 1);
                char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
                if (lastChar != thisChar && lastLastChar != thisChar) {
                    sb.append(thisChar);
                }
            }
        }
    public void method(){
        private StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(i);
            System.out.println(sb.toString());
        }
    }
    
        return sb.toString();
    }

    
}