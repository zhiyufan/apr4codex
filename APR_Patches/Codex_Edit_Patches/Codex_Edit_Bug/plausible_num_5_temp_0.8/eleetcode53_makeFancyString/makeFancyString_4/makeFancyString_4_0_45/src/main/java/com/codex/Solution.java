package com.codex;

import java.util.*;

public class Solution {
public static String makeFancyString(String s) {


        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            result += s.charAt(i);
            if (count > 1) {
                result = result + count;
            }
        }
        return result;
}
}