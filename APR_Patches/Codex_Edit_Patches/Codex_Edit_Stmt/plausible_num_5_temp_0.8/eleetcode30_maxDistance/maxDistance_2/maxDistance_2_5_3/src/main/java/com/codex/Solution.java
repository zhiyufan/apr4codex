package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;

    public int solution(String s) {

        if(s == null || s.length() == 0) return 0;

        int result = 0;
        int temp = 0;

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),1);
                temp++;
                result = result < temp ? temp : result;
            }
            else
            {
                map.clear();
                temp = 0;
            }
        }

        return result;
    }

    }

    
}