package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {


    int[] arr = new int[times.length];
    for (int i = 0; i < times.length; i++) {
        int arrival = times[i][0];
        int leaving = times[i][1];
        arr[arrival]++;
        arr[leaving]--;
    }

    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
        cnt += arr[i];
        if (cnt - 1 == targetFriend)
            return i;
    }

    return -1;
}


    public static String intToRoman(int num) {

        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] val = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder sb = new StringBuilder();
        int i = val.length - 1;
        while (num > 0) {
            int div = num / val[i];
            num = num % val[i];
            while (div-- > 0) {
                sb.append(roman[i]);
            }
            i--;
        }

        return sb.toString();
    }
}