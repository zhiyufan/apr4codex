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


    int padding = 0;
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        while(sChar[padding] == ' '){
            padding++;
        }
        if(padding == sChar.length){
            return "0";
        }
        if(sChar[padding] == '0') {
        	return "0";
        }
        int finalNumber = 0;
        for(int i = padding; i< sChar.length; i++) {
            finalNumber = finalNumber * 10 + sChar[i] - '0';
        }
        return Integer.toString(finalNumber);
        }
        return sb.toString();
    }

    
}