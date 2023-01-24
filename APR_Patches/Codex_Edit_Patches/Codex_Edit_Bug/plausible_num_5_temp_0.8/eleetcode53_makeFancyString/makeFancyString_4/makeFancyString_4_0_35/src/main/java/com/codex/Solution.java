package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class file {
    public static String makeFancyString (String s) {

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < 2) {
                result += s.charAt(i);
            } else {
                if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2)) {

                } else {
                    result += s.charAt(0);
                }
            }

        }
        return result;
    }

    public static void main (String[] args) {

        String s = "aabccdc";
        System.out.println(makeFancyString(s));

    }
}
}