package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] matrixSum = new int[rows][cols];

        matrixSum[0][0] = matrix[0][0];

        for(int i=1;i<rows;i++) {
            matrixSum[i][0] = matrixSum[i-1][0] + matrix[i][0];
        }

        for(int j=1;j<cols;j++) {
            matrixSum[0][j] = matrixSum[0][j-1] + matrix[0][j];
        }

        for(int i=1;i<rows;i++) {
            for(int j=1;j<cols;j++) {
                matrixSum[i][j] = matrix[i][j] + Math.max(matrixSum[i-1][j],matrixSum[i][j-1]);
            }
        }

        long maxSum = Long.MIN_VALUE;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(maxSum<matrixSum[i][j]) {
                    maxSum = matrixSum[i][j];
                }
            }


    public class Solver {

    public int compute(String s) {
        if(s.length()==1) {
            return s.charAt(0)-'0';
        }
        int sum = 0;
        for(int i=0;i<s.length();i++) {
            sum += s.charAt(i)-'0';
        }
        return compute(Integer.toString(sum));
    }

    public long compute(long n) {
        int num = 0;
        for(long i=1;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                if(i*i==n) {
                    num++;
                } else {
                    num +=2;
                }
            }
        }
        return num;
    }

    public long solve(int n, int[] s) {
        List<Long> list = new ArrayList<>();
        for(int i=0;i<s.length;i++) {
            long val = (long)s[i];
            if(val==1) {
                list.add(1l);
            }
            while(val!=1) {
                long div = 1;
                while(val%div==0) {
                    div++;
                }
                div -=1;
                while(val%div==0) {
                    val /= div;
                }
                list.add(div);
            }
        }
        if(list.size()>=2) {
            long val = 0;
            for(int i=0;i<list.size();i++) {
                val += compute(list.get(i));
            }
            long ans = val;
            long mod = (long)1e9+7;
            ans %= mod;
            for(int i=0;i<list.size();i++) {
                long val1 = list.get(i);
                ans *= val1;
                ans %= mod;
            }
            return ans;

        } else {
            long val = list.get(0);
            long mod = (long)1e9+7;
            return (compute(val)*val)%mod;
        }
    }
}
        }

        return maxSum;
    }
}