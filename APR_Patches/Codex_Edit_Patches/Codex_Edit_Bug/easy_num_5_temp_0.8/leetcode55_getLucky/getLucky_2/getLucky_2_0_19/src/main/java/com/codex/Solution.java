package com.codex;

import java.util.*;

public class Solution {
public static String newString(String s) {
		String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.contains((char)i+48) == false) {
                s1 = s1 + (char)i+48;
            }
        }
        return s1;
    }

}