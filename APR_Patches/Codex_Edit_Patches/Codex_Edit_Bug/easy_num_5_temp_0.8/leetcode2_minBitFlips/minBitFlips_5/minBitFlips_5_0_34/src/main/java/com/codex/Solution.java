package com.codex;

import java.util.*;

public class Solution {
public class Test {
	
	
	
	public static void main(String[] args) {
		int x = 0b111111111;
		int k = -1;
		
		System.out.println(minBitFlips(x, k));
	}
	
	
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                if (i > 0 && start == (goal ^ (1 << i))) {
                    return -1;
                }
                start ^= 1 << i;
            }
            start >>= 1;
            goal >>= 1;
            i++;
        }
        return count;
    }
 }
    

    
}