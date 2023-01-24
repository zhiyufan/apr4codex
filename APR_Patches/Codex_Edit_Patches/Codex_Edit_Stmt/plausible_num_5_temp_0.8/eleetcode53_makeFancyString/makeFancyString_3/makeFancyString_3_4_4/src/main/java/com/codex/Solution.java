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
                char lastChar = sb.charAt(sb.length() - 1); //这句话很重要，不能写成char lastChar = sb.charAt(i-1)
                char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' '; //这里很多样例是因为写成char lastLastChar = sb.charAt(i-2)出错
                if (lastChar != thisChar && lastLastChar != thisChar) { //这里也很多样例是因为写成char lastLastChar == thisChar出错
                    sb.append(thisChar);
                }
            }
        }
        return sb.toString();
    }

    
}