package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {

        int n = colors.length;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++)
	{
            if (colors[i] != lastColor) {
                if (lastColor != -1)
		{
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
	if(maxDist != 0)
	{
		return maxDist;
	}
	else
	{
		return -1;
	}
    }

    
}