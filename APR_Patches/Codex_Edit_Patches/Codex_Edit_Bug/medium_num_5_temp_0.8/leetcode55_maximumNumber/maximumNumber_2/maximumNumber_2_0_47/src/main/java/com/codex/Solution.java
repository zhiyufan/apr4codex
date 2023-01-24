package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }
    public static String digit(String num) {
        String[] arr = new String[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = Integer.toString(i);
        }
        
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < num.length(); i++) {
            newStr.append(arr[Character.getNumericValue(num.charAt(i))]);
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
    	try {
    		File infile = new File("input.txt");
    		File outfile = new File("output.txt");
    		FileInputStream in = new FileInputStream(infile);
    		FileOutputStream out = new FileOutputStream(outfile);
    		Scanner sc = new Scanner(in);
    		int testcases = Integer.parseInt(sc.nextLine());
    		for (int i = 0; i < testcases; i++) {
    			String num = sc.nextLine();
    			String[] arr = num.split(" ");
    			String str = arr[0];
    			int n = Integer.parseInt(arr[1]);
    			int[] change = new int[10];
    			for(int j = 0; j < 10; j++) {
    				change[j] = j;
    			}
    			for(int j = 0; j < n; j++) {
    				String[] sarr = sc.nextLine().split(" ");
    				int digit = Integer.parseInt(sarr[0]);
    				int exchange = Integer.parseInt(sarr[1]);
    				int temp = change[exchange];
    				change[exchange] = digit;
    				change[digit] = temp;
    			}
    			String outstr = digit(str);
    			outstr = maximumNumber(outstr, change);
    			out.write(outstr.getBytes());
    		}
    	} catch (Exception e) {
    		
    	}
    }
    
    
}