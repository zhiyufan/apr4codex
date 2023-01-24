package com.codex;

import java.util.*;

public class Solution {
package beauty;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String[] str = new String[N];
		for(int i = 0; i<N; i++) {
			str[i] = sc.nextLine();
		}
		
		for(int i = 0; i<N; i++) {
			String s = str[i];
			int count = minimumMoves(s);
			System.out.println(count);
		}
		
	}
	
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
        	if (s.charAt(i) == 'X') {
	        	for (int j = i + 1; j < s.length() - 1; j++) {
	                if (s.charAt(j) == 'X') {
	                    for (int k = j + 1; k < s.length(); k++) {
	                        if (s.charAt(k) == 'X') {
	                            if (s.charAt(k-1) == '-' && s.charAt(k-2) == '-') {
	                            	count++;
	                            } else {
	                                break;
	                            }
	                        }
	                    }
	                }
	            }
            }
        }
        return count;
    }

}    
}