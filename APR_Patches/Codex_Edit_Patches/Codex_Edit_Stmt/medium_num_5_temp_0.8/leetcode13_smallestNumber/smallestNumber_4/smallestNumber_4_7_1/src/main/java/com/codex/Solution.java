package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        if (newS.charAt(0) == '0') {
            boolean firstNotZero = false;
            int i = 0;
            while (!firstNotZero) {
                if (newS.charAt(i) != '0') {
                    firstNotZero = true;
                    char temp = newS.charAt(0);
                    newS = newS.substring(0, i) + temp + newS.substring(i + 1);
                    newS = newS.substring(1);
                } else {
                    i++;
                }
            }
        }
        return Long.parseLong(newS);
    }

    static String withoutString(String base, String remove) {
        String newBase = base;
        String newRemove = remove.toLowerCase();
        int length = base.length();
        while(base.length() > 0) {
            if (base.length() == newRemove.length() && base.toLowerCase().equals(newRemove)) {
                base = base.substring(newRemove.length());
            } else if (base.toLowerCase().contains(newRemove)) {
                base = base.substring(0, base.toLowerCase().indexOf(newRemove)) + base.substring(base.toLowerCase().indexOf(newRemove) + newRemove.length());
            } else {
                break;
            }
        }
        return base;
    }

    static void addAll(List<Integer> list, List<Integer> add, int index) {
        for (int x : add) {
            list.add(index, x);
        }
    }
}