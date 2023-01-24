package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] change = new int[10];
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                change[a] = b;
            }
            if (n == 0) {
                break;
            }
            String num = in.next();
            String max = maximumNumber(num, change);
            String min = minimumNumber(num, change);
            System.out.println(min + " " + max);
        }
    }

    public static String maximumNumber(String num, int[] change) {
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            int max = change[digit];
            for (int d = digit + 1; d < 10; d++) {
                if (change[d] > max) {
                    max = change[d];
                }
            }
            sb.setCharAt(i, (char) (max + '0'));
        }
        return sb.toString();
    }

    public static String minimumNumber(String num, int[] change) {
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            int min = change[digit];
            for (int d = digit - 1; d >= 0; d--) {
                if (change[d] < min) {
                    min = change[d];
                }
            }
            sb.setCharAt(i, (char) (min + '0'));
        }
        return sb.toString();
    }
}
}