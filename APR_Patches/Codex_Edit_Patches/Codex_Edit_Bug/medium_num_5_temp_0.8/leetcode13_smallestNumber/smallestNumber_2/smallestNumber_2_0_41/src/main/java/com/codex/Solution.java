package com.codex;

import java.util.*;

public class Solution {
 public static String smallNumStr(String num) {

        StringBuilder str = new StringBuilder(num);
        str.sort(Comparator.naturalOrder());
        return str.toString();
    }
}