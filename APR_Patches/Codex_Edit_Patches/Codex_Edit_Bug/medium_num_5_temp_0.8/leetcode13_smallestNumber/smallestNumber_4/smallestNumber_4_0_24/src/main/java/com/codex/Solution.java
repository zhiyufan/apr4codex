package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(smallestNumber(26712));
    }

    public static long smallestNumber(long num) {

        String s = String.valueOf(num); //num to string
        char[] c = s.toCharArray(); //string to char array
        Arrays.sort(c); //sorting the char array
        String newS = new String(c); //sorted char array to string
        if (newS.charAt(0) == '0') { //if first digit is 0, then
            boolean firstNotZero = false; //iterator
            int i = 0; //start from 0
            while (!firstNotZero) { //keep going until a non-zero digit
                if (newS.charAt(i) != '0') { //found a non-zero digit
                    firstNotZero = true; //stop
                    char temp = newS.charAt(0); //save the first digit
                    newS = newS.substring(0, i) + temp + newS.substring(i + 1); //put the non-zero digit in front
                    newS = newS.substring(1); //cut out the old first digit
                } else { //no non-zero digit yet, keep going
                    i++; //increment the iterator
                }
            }
        }
        return Long.parseLong(newS);
    }

    
}