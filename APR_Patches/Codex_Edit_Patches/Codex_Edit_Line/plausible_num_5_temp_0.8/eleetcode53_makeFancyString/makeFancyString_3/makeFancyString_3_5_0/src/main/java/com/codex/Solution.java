package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        s = s.replaceAll("a", "4");
        s = s.replaceAll("e", "3");
        s = s.replaceAll("i", "8");
        s = s.replaceAll("o", "0");
        s = s.replaceAll("s", "5");
        s = s.replaceAll("b", "6");
        String[] arr = s.split(" ");
        for (String part : arr) {
            String thisPart = part.substring(0, 1).toUpperCase() + part.substring(1) + " ";
            sb.append(thisPart);
        }
        return sb.toString();
    }

    
}