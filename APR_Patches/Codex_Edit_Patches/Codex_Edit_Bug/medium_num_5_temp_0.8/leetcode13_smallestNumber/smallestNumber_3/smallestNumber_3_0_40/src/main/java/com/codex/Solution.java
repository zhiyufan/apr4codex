package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // write your code here
        System.out.println(changeX("xxx"));
        System.out.println(changeX("xaxx"));
    }

    public static String changeX(String str) {
        if (str.length() == 0) {
            return "";
        }
        String word = str.substring(0, str.length() - 1);
        boolean check = str.charAt(str.length() - 1) != 'x';
        return changeX(word) + (check ? str.charAt(str.length() - 1) : "");
    }

    
}