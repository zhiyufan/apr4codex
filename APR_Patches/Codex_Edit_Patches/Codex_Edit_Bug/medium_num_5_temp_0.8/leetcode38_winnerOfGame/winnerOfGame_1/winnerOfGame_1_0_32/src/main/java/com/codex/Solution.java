package com.codex;

import java.util.*;

public class Solution {

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println(winnerOfGame("ABCBA"));
	}
	public static boolean winnerOfGame(String colors) {
        
        int i = 0, count = 0;
        while (i < colors.length() - 1) {
        	
            char currentColor = colors.charAt(i);
            if (currentColor == 'A') {
                if (i == 0){
                	
                	i = getNextIndex(i, 1, colors);
                	count++;
                } else if (i == colors.length() - 1) {
                	
                	i = getNextIndex(i, -1, colors);
                	count++;
                } else {
                    i = getNextIndex(i, 1, colors);
                	count++;
                }
            } else {
                i++;
            }
        }
        return (count % 2 == 0);
    }

	private static int getNextIndex(int index, int direction, String colors) {
		
		if (colors.charAt(index) == colors.charAt(index + direction)) {
        	
        	return (index + (direction * 2));
        }
		
		int init = index;
		while (init >= 0 && init < colors.length() - 1) {
			
			init = init + direction;
			if (colors.charAt(index) == colors.charAt(index + direction)) {
				
				return (index + direction);
			}
		}
		
		return (index + direction);
	}
}


    
}