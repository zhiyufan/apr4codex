package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }

	
	
	
	
	public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            result.add(isArithmetic(nums, l[i], r[i]));
        }
        return result;
    }
  
    public static boolean isArithmetic(int[] nums, int start, int end) {
        int[] subArray = Arrays.copyOfRange(nums, start, end + 1);
        Arrays.sort(subArray);
        int diff = subArray[1] - subArray[0];
        for (int i = 1; i < subArray.length - 1; i++) {
            if (subArray[i+1] - subArray[i] != diff) {
                return false;
            }
        }
        return true;
    }
    
}