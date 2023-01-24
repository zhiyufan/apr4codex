package com.codex;

import java.util.*;

public class Solution {
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main 
{
public static long[] sumOfThree(long num) {
    // your code here


    long[] array = new long[0];

    if (num < 3) return array;

    for (long a = 1; a < num - 1; ++a) {
        for (long b = a + 1; b < num; ++b) {
            for (long c = b + 1; c < num + 1; ++c) {
                if (a + b + c == num) {
                    array = new long[]{a, b, c};
                    return array;
                }
            } 
        }
    }
    return array;
}

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            long[] array = sumOfThree(num);
            System.out.print(array[0]);
            System.out.print(array[1]);
            System.out.println(array[2]);
        }
    }
}
}