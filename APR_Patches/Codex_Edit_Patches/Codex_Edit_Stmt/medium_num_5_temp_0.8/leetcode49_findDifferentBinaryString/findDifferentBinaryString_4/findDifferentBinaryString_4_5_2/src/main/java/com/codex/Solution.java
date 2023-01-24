package com.codex;

import java.util.*;

public class Solution {
public class abc {


    public static void main(String[] args) {
        String s = "abcdefg";
        StringBuilder sb = new StringBuilder("abcdefg");
        while (s.length() != 1) {
            StringBuilder temp = new StringBuilder("");
            int length = s.length();
            for (int i = 0; i < length; i += 2) {
                if (i + 1 == length) {
                    temp.append(s.charAt(i));
                    //sb.append(s.charAt(i));
                    break;
                } else if (s.charAt(i) == s.charAt(i + 1)) {
                    temp.append(s.charAt(i));
                    //sb.deleteCharAt(i);
                    //sb.deleteCharAt(i);
                    //sb.append(s.charAt(i));
                }
            }
            if (temp.toString().equals(s)) {
                break;
            } else {
                s = temp.toString();
            }
        }
        System.out.println(s);
    }
}
}