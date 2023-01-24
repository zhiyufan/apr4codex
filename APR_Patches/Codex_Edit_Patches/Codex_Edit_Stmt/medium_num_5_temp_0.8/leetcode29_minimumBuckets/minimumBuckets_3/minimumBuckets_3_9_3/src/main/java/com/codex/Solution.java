package com.codex;

import java.util.*;

public class Solution {
public class Test {

    public static void main(String[] args) {
        System.out.println(minimumNumberOfBuckets("..H...H..."));
    }

    public static int minimumNumberOfBuckets(String street) {
        if (street == null || street.length() == 0) {
            return 0;
        }

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
}