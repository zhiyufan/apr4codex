package com.codex;

import java.util.*;

public class Solution {
class Solution {
public:
    int maxArea(vector<int>& height) {
        int l=0,r=height.size()-1,ma=0;
        while(l<r){
            ma=max(ma,min(height[l],height[r])*(r-l));
            if(height[l]<height[r])++l;
            else --r;
        }
        return ma;
    }

};
}