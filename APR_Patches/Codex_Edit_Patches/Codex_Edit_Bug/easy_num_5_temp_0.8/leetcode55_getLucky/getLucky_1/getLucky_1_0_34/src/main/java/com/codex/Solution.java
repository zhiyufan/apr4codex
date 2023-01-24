package com.codex;

import java.util.*;

public class Solution {
public class test {
    
    public static void main(String[] args) {
        System.out.print(getLucky("abab",1));
    }

    public static int getLucky(String s, int k) {
        int[] c = new int[1000005];
        c[0] = 1;
        for (int i = 1; i < 1000005; i++) {
            int temp = 0;
            while (i > 0) {
                temp += i % 10;
                i /= 10;
            }
            c[i] = temp;
        }
        int a = 0;
        for (int i = 1; i <= s.length(); i++) {
            a += (s.charAt(i - 1) - 'a' + 1);
        }
        if (k == 0) {
            return a;
        }
        return c[a];
        int result = 0;
    }

}
}