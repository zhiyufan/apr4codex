package com.codex;

import java.util.*;

public class Solution {
    public static void mystery(String word) {
        if (word.length() <= 1) {
            System.out.print(word + " ");
        } 
        else {
            System.out.print(word.charAt(word.length() / 2) + " ");
            mystery(word.substring(0, word.length() / 2));
            mystery(word.substring(word.length() / 2 + 1));
        }
    }   
}