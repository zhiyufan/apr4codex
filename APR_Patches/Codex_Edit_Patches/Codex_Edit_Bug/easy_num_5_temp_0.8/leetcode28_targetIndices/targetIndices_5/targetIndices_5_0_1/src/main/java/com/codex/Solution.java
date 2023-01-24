package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int water=0;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                water=height[left]*(right-left);
            else
            {
                water=height[right]*(right-left);
                right--;
            }
            if(water>max)
                max=water;
                left++;
            }
        }
        return max;
    }

}
}