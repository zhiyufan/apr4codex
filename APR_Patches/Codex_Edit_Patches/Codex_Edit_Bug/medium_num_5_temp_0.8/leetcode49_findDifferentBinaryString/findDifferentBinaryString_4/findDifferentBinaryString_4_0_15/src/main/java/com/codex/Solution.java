package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] binaryStrings) {
        if (binaryStrings == null || binaryStrings.length == 0) {
            return null;
        }
        int[][] count = new int[binaryStrings[0].length()][2];
        for (String binaryString : binaryStrings) {
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '0') {
                    count[i][0] += 1;
                } else if (binaryString.charAt(i) == '1') {
                    count[i][1] += 1;
                }
            }
        }
        StringBuilder binaryString = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            if (count[i][0] > count[i][1]) {
                binaryString.append('0');
            } else {
                binaryString.append('1');
            }
        }
        return binaryString.toString();
    }
    public static void main(String[] args){
        String[] binaryStrings = {"10111","10111"};
        System.out.println(findDifferentBinaryString(binaryStrings));
    }
} 
}