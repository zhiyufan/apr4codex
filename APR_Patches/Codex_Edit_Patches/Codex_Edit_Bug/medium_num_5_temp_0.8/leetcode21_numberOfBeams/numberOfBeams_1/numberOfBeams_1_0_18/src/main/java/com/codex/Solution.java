package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int beams = 0;
        for (int i = 0; i < bank.length; i++) {
            int num = Integer.parseInt(bank[i], 2);
            for (int j = 0; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if (i != j && (tmp & num) == 0) {
                    beams += Integer.bitCount(num);
                    break;
                }
            }
        }
        return beams;
    }



//code
public static int[] toArray(String n){
    int[] arr = new int[n.length()];
    for(int i=0;i<n.length();i++)
        arr[i] = n.charAt(i) - '0';
    return arr;
}
    
public static String add(int[] a, int[] b){
    int[] result = new int[a.length+1];
    int sum = 0, carry = 0;
    for(int i=b.length-1;i>=0;i--){
        sum = a[i] + b[i] + carry;
        if(sum > 1){
            carry = 1;
            sum = sum % 2;
        }
        else
            carry = 0;
        result[i+1] = sum;
    }
    if(carry == 0)
        return Arrays.toString(result).replaceAll("\\[|\\]|,|\\s", "");
    result[0] = carry;
    return Arrays.toString(result).replaceAll("\\[|\\]|,|\\s", ""); 
}
    
public static String sum(String a, String b){
    if(a.length() == b.length()){
        int[] ar = toArray(a);
        int[] br = toArray(b);
        return add(ar, br);
    }
    else{
        int[] arr = toArray("0");
        int[] brr = new int[1];
        if(a.length() > b.length()){
            arr = toArray(a);
            brr = new int[a.length() - b.length()];
        }
        else{
            arr = toArray(b);
            brr = new int[b.length() - a.length()];
        }
        int[] bar = toArray(b);
        int[] aar = toArray(a);
        return add(arr, brr);
    }
}
    
public static int numOfBeams(String[] bank){
    int count = 0;
    for(int i=0;i<bank.length;i++)
    {
        char[] first = bank[i].toCharArray();
        boolean flag = true;
        for(int j=0;j<bank.length;j++)
        {
            if(i == j)
                continue;
            else{
                char[] second = bank[j].toCharArray();
                for(int c=0;c<first.length;c++)
                {
                    if(first[c] == '1' && second[c] == '1')
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    count += Integer.bitCount(Integer.parseInt(String.valueOf(first), 2));
            }
        }
    }
    return count;
}
    
}