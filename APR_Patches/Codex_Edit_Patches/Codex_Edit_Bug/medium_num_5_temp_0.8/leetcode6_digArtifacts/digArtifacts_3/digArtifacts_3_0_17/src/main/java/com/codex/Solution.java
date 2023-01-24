package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int l = 0; l < testCases; l++) {
            int value = in.nextInt();
            int N = in.nextInt();
            int M = in.nextInt();
            int[] coins = new int[N];
            for(int i = 0; i < N; i++) {
                coins[i] = in.nextInt();
            }
            int[][] arr = new int[N][value+1];
            for(int i = 0; i < N; i++) {
                arr[i][0] = 1;
            }
            for(int i = 1; i <= value; i++) {
                if (i % coins[0] == 0) {
                    arr[0][i] = 1;
                } else {
                    arr[0][i] = 0;
                }
            }
            for(int i = 1; i < N; i++) {
                for(int j = 1; j <= value; j++) {
                    if (j >= coins[i]) {
                        arr[i][j] = arr[i - 1][j] + arr[i][j - coins[i]];
                    } else {
                        arr[i][j] = arr[i - 1][j];
                    }
                }
            }
            System.out.println(arr[N-1][value]);
        }
    }
}