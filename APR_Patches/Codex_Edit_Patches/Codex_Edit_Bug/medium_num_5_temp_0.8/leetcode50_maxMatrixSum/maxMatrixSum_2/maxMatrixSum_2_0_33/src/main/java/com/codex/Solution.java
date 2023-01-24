package com.codex;

import java.util.*;

public class Solution {
package com.jobs.matomesan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

	static int[][] readData(String s){
		Scanner sc = new Scanner(System.in);
		int[][] result = new int[s.length()][s.length()];
		for(int i = 0; i < s.length(); i++){
			for(int j = 0; j < s.length(); j++){
					result[i][j] = sc.nextInt();
			}
		}
		return result;
	}
	
    public static long maxMatrixSum(int[][] matrix) {
        
        int n = matrix.length;
        int[][] sums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sums[i][j] = matrix[i][j];
            }
        }
        for (int i = 1; i < n; i++) {
            sums[0][i] += sums[0][i - 1];
            sums[i][0] += sums[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                sums[i][j] += Math.max(sums[i - 1][j], sums[i][j - 1]);
            }
        }
        return sums[n - 1][n - 1];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for(int i = 0; i < N; i++){
    		String s = sc.next();
    		System.out.println(maxMatrixSum(readData(s)));
    	}
    }
}

    
}