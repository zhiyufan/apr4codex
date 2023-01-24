package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static void main(String[] args) {
        String s = "abcd";
        print(s);
        }
        public static void print(String s){
        for (int i = 1; i < s.length() ; i++) {
            for (int j = 0; j <= s.length() - i; j++) {
                System.out.println(s.substring(j, j + i)); /* extract substring of i length */
            }
          }
        }
}
}