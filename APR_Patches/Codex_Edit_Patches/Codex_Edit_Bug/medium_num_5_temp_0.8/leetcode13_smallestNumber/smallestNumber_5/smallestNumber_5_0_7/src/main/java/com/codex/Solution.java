package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Main {

    public static long smallestNumber(long num)
    {

        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String newString = "";
        for (int i = 0; i < arr.length; i++)
        {
            newString += arr[i];
        }
        long result = Long.parseLong(newString);
        return result;

    }

    public static void main(String[] args)
    {
        System.out.println(smallestNumber(1278));
    }
}
}