package com.codex;

import java.util.*;

public class Solution {
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package issh;

import java.util.Scanner;

/**
 *
 * @author SONY
 */
public class ISSH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(maximumSubsequenceCount(s.nextLine(), s.nextLine()));
    }
   
    static long maximumSubsequenceCount(String text, String pattern) {
    long res = 0;
    int m = text.length();
    int n = pattern.length();
    int j = 0;

    for (int i = 0; i <= m - n; i++) {

        while (j < n && text.charAt(i + j) == pattern.charAt(j))
            j++;

        if (j == n) {
            res++;
            j = 0;
        }
    }
    return res;
}


}


    



    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                for (int j = i + 1; j < text.length(); j++) {
                    if (text.charAt(j) == pattern.charAt(1)) {
                        res += 1;
                    }
                }
            }
        }
        return res;
    }
}