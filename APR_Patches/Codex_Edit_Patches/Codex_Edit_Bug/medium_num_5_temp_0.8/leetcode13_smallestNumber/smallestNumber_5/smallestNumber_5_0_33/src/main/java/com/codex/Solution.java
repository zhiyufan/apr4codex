package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class SmallestNumber
{
    public static void main(String[] args){
        System.out.println(smallestNumber(Long.parseLong("175296")));
    }
    public static long smallestNumber(long num){
        String numToString = String.valueOf(num);
        String[] arr = numToString.split("");
        Arrays.sort(arr, (a,b)-> a.compareTo(b));
        StringBuilder sb = new StringBuilder(numToString.length());
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }
        long result = Long.parseLong(sb.toString());
        return result;
    }
}
}