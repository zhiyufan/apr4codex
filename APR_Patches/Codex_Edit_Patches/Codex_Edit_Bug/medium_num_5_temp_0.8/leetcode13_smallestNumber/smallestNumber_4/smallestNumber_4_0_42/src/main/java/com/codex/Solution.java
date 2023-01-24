package com.codex;

import java.util.*;

public class Solution {
package abc;

import java.util.Arrays;

public class SmallestNumber {

    public static void main(String[] args) {
        System.out.println(smallestNumber(59884848483559l));
    }

    public static long smallestNumber(long num) {
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        return Long.parseLong(newS);
    }

}
}