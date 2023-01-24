package com.codex;

import java.util.*;

public class Solution {
      /* @author Rakesh Vidyadharan
      * Program to find the smallest number which can be formed fr a given number,
      * rearranging the digits.
      * 
      * Given number is not to be modified and a new number is to be created.
      * 
      */
    

    public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        if (newS.charAt(0) == '0') {
            boolean firstNotZero = false;
            int i = 0;
            while (!firstNotZero) {
                if (newS.charAt(i) != '0') {
                    firstNotZero = true;
                    char temp = newS.charAt(0);
                    newS = newS.substring(0, i) + temp + newS.substring(i);
                    newS = newS.substring(1);
                } else {
                    i++;
                }
            }
        }
        return Long.parseLong(newS);
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(smallestNumber(num));
    }
    
}

    
}