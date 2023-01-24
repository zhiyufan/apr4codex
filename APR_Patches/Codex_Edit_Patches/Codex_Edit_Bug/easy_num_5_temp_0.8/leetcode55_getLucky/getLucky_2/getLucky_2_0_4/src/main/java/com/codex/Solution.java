package com.codex;

import java.util.*;

public class Solution {
public static int getLucky(String s, int k) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - 96;
        }        
        for(int i = 0; i < k; i++) {
            int number = sum;
            sum = 0;
            while(number != 0){
                sum = sum + number % 10;
                number /= 10;
            }
        }
    }
}