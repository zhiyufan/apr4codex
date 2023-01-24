package com.codex;

import java.util.*;

public class Solution {
public class FindOriginalArray {

	public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length/2];

        int[] map = new int[10];
        int odd = -1;
        for (int i : changed){
        	map[i]++;
        }
        int index = 0;
        for (int i = 0; i<map.length; i++)
        	if (map[i] % 2 == 1) odd = i;
        	
        if (odd == -1) return new int[0];
        
        for (int i = 0; i<map.length; i++)
        	for(int j = 0; j<map[i]/2; j++)
        		original[index++] = i;
        
        return original;
	}

}


    
}