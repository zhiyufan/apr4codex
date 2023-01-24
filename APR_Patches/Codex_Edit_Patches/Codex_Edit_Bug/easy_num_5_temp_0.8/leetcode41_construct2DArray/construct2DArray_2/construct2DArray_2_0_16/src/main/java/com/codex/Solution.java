package com.codex;

import java.util.*;

public class Solution {
      for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                break;
        }

            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            if (c1 == c2) {
                s = s.substring(0, i) + s.substring(i + 2);
                i = -1;
            }
        }

        if (s.length() > 0) {
            return s;
        } else {
            return "Empty String";
        }



        char[] sChars = s.toCharArray();
        int p = 0;
        int q = 1;
        while (q < s.length()) {
            while (q < s.length() && sChars[p] == sChars[q]) {
                q++;
            }
            if (q < s.length()) {
                sChars[p + 1] = sChars[q];
            }
            p++;
            q++;
        }
        int pos = 0;
        while (pos < s.length() && sChars[pos] != 0) {
            pos++;
        }
        return new String(sChars, 0, pos);
}