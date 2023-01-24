package com.codex;

import java.util.*;

public class Solution {
package com.upc;

import java.util.Arrays;

/**
 * Created by Panos on 12/8/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(smallestNumber(10));
    }

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
                    newS = newS.substring(0, i) + temp + newS.substring(i + 1);
                    newS = newS.substring(1);
                } else {
                    i++;
                }
            }
        }
        return Long.parseLong(newS);
    }
}


    
}