package com.codex;

import java.util.*;

public class Solution {
public class TestClass {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for(int t_i=0; t_i<T; t_i++)
		{
			String[] inp = br.readLine().split(" ");
			long N = Long.parseLong(inp[0]);
			int K = Integer.parseInt(inp[1]);
			long out_ = solve(N, K);
			System.out.println(out_);
		}
		wr.close();
		br.close();
	}
	static long solve(long A, int B){
	    // Write your code here
	    long s = A;
	    while(B > 0) {
	        long min = smallestNumber(s);
	        long max = largestNumber(s);
	        if (min == max)
	            break;
	        long diff = max - min;
	        s += diff;
	        B--;
	    }
	    return s;
	}
	public static int smallestNumber(long num) {
    
        int[] res = new int[10];
        while (num > 0) {
            res[(int)(num % 10)]++;
            num /= 10;
        }
        int small = 0;
        for (int i = 1; i < 10; i++) {
            if (res[i] > 0) {
                small = i;
                res[i]--;
                break;
            }
        }
        int min = small;
        for (small = 0; small < 10; small++) {
            while (res[small]-- > 0) {
                min = min * 10 + small;
            }
        }
        return min;
    }
    public static int largestNumber(long num) {
    
        int[] res = new int[10];
        while (num > 0) {
            res[(int)(num % 10)]++;
            num /= 10;
        }
        int large = 9;
        for (int i = 9; i >= 0; i--) {
            if (res[i] > 0) {
                large = i;
                res[i]--;
                break;
            }
        }
        int max = large;
        for (large = 9; large >= 0; large--) {
            while (res[large]-- > 0) {
                max = max * 10 + large;
            }
        }
        return max;
    }
}
}