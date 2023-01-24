package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        long result = smallestNumber(234566);
        System.out.println(result);
       
    }

    public static long smallestNumber(long num) {        
        
        String s = "" + num;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = (int)s.charAt(i);
        }
        long result = Long.parseLong(newString);
        return result;
    }

    
}