package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;


public class Sample {

    public static int getLucky(String s, int k) {
        int sum = 0;

        s = s.toLowerCase();
        int number = 0;

        //System.out.println((int)(s1.charAt(0))-96);

        for (int i = 0; i < s.length(); i++) { 
            sum = sum + ((int)(s.charAt(i))-96);
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