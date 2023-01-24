package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        if (s == null || s.length() == 0) {
            return s;
        }
        if (s.length() == 1 || s.length() == 2) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            } else {
                sb.append(s.charAt(i));
            }
        }

        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != s.charAt(s.length() - 1)) {
            sb.append(s.charAt(s.length() - 1));
        }

        return sb.toString();



import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MakeFancyStringTest {

    @Test
    public void testFancyString() {

        String s = "AABCCDDDD";
        assertEquals("ABCD", MakeFancyString.makeFancyString(s));
        s = "AAAA";
        assertEquals("A", MakeFancyString.makeFancyString(s));
        s = "ABAA";
        assertEquals("ABA", MakeFancyString.makeFancyString(s));
        s = "BABA";
        assertEquals("BABA", MakeFancyString.makeFancyString(s));
        s = "ABAB";
        assertEquals("ABAB", MakeFancyString.makeFancyString(s));
        s = "BBAAABBB";
        assertEquals("AB", MakeFancyString.makeFancyString(s));

    }
}

    }

    
}