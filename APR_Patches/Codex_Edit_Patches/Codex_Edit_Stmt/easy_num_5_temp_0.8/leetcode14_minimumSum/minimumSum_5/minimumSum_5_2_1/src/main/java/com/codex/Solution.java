package com.codex;

import java.util.*;

public class Solution {
import java.util.stream.Collectors;

    public static int minimumSum(int num) {
        String str = String.valueOf(num);
        String[] arr = str.split("");
        String newString = "";
        int count = 0;
        for (String s : arr) {
            if (!s.equals("0"))
                newString += s;
            else
                count++;
        }
        if (count >= arr.length - 1)
            return 0;
        else
            return Integer.parseInt(newString);
    }
}