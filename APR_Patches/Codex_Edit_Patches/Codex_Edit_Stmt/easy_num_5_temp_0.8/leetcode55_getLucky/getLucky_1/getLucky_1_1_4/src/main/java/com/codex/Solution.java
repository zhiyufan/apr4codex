package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k){
        int res = 0;
        for (Character c : s.toCharArray())
            res += (c - 'a' + 1);
        for (int i = 0 ; i < k ; i ++){
            int temp = 0;
            while (res > 0){
                temp += res % 10;
                res /= 10;
            }
            res = temp;
        }
        return res;
    }
}