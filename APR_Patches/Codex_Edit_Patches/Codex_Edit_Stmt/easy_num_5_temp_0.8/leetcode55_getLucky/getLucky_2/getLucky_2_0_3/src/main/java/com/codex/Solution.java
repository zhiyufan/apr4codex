package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int getLucky(String s, int k) {
        if (k==0) {
            return -1;
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

    
}