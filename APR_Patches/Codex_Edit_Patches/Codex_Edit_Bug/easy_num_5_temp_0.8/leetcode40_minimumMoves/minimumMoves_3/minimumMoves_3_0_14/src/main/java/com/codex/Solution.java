package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public static int minimumMoves(String s) {

        if (s.length() == 1)
            return 1;
        if (s.charAt(0) == s.charAt(1)) {
            s = s.substring(1);
            return minimumMoves(s) + 1;
        }
        StringBuilder sb = new StringBuilder(s);
        int temp = minimumMoves(s.substring(1));

        sb.replace(0, 3, "XXX");
        temp = Math.min(temp, minimumMoves(sb.toString()) + 1);

        sb.replace(0, 3, "XO");
        temp = Math.min(temp, minimumMoves(sb.toString()) + 1);

        return temp;
    }

}
}