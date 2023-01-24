package com.codex;

import java.util.*;

public class Solution {
	
    public static int addRungs(int[] rungs, int dist) {
        
        int count = 0;
        int max = 0;
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > max) {
                if (rungs[i] - max > dist) {
                    count++;
                    max = max + dist;
                } else if (rungs[i] - max <= dist) {
                    max = rungs[i];
                }
            }
        }

        return count;
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Ladder {

	    public static void main(String[] args) throws IOException{
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        String[] strs = br.readLine().trim().split("\\s+");
	        int[] rungs = new int[n];
	        for (int i = 0; i < n; i++) {
	            rungs[i] = Integer.parseInt(strs[i]);
	        }

	        int dist = Integer.parseInt(br.readLine());

	        System.out.println(addRungs(rungs, dist));
	    }

	    public static int addRungs(int[] rungs, int dist) {
	        
	        int count = 0;
	        int max = 0;
	        for (int i = 0; i < rungs.length; i++) {
	            if (rungs[i] > max) {
	                if (rungs[i] - max > dist) {
	                    count++;
	                    max = max + dist;
	                } else if (rungs[i] - max <= dist) {
	                    max = rungs[i];
	                }
	            }
	        }

	        return count;
	    }
	}

	
    }

    
}