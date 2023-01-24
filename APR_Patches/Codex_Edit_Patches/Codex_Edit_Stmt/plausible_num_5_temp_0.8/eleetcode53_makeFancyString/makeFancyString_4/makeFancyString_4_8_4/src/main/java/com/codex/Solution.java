package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(makeFancyString("goooooood"));

    }
    public static String makeFancyString(String s) {
    
        String result = "";
        for (int i = 0; i < s.length(); i++) {
                if (i == 1 && s.charAt(0) == s.charAt(1)) {
                    StringBuilder sb = new StringBuilder(result);
                    sb.setCharAt(0, s.charAt(0));
                    result = sb.toString();
                    i++;
                } else {
                    result += s.charAt(i);
                }
            } else {
                if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i - 2)) {
                    result += s.charAt(i);
                }
            }
        }
        return result;
    }







            if (i <= 1) {
                if (i == 1 && s.charAt(0) == s.charAt(1)) {
                    result += s.charAt(0);
                    i++;
                } else {
                    result += s.charAt(i);
                }
            } else {
                if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i - 2)) {
                    result += s.charAt(i);
                }
            }
        }
        return result;
    }

    
}