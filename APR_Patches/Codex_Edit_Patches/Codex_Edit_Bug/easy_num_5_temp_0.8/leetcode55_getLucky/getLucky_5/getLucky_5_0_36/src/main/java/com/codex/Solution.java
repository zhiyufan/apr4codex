package com.codex;

import java.util.*;

public class Solution {
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLucky("input", 5));
    }

    private static int getLucky(String s, int k) {

        int convert;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + (int) s.charAt(i);
        }
        if (sum % 2 == 0) {
            convert = sum / 2;
        } else {
            convert = (sum + 1) / 2;
        }

        while (k > 2) {
            while (convert > 0) {
                int r = convert % 10;
                sum = sum + r;
                convert = convert / 10; }
            convert = sum;
            k--;
        }

        return transformation;
    }
}