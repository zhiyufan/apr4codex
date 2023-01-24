package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        s = s.toLowerCase();
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number + s.charAt(i) - 96;
        }
        while (k > 0) {
            int sum = 0;
            while (number != 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            number = sum;
            k--;
        }
        return number;
    }


    public String decompress(String input) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ')') {
                sb.append(ch);
                continue;
            }
            int index = sb.length() - 1;
            while (sb.charAt(index) != '(') {
                index--;
            }
            int num = 0;
            for (int k = index + 1; k < sb.length() - 1; k++) {
                num = num * 10 + sb.charAt(k) - 48;
            }
            //             int num = Integer.parseInt(sb.substring(index + 1 , sb.length() - 1));
            String rep = sb.substring(index - 1, index);
            StringBuilder rep2 = new StringBuilder();
            for (int j = 0; j < num; j++) {
                rep2.append(rep);
            }
            //             String rep2 = rep.repeat(num);
            sb.delete(index - 1, sb.length());
            sb.append(rep2);
        }
        return sb.toString();

    }

    
}