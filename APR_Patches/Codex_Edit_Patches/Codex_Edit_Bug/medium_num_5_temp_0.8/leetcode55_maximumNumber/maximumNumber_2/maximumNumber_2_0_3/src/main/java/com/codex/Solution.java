package com.codex;

import java.util.*;

public class Solution {
        int[] change = new int[10];
        
        for (int i = 0; i <= 9; i++) {
            change[i] = i;
        }

        String number = "1234";


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            sb.append(change[digit]);
        }
        System.out.println(sb.toString());
}