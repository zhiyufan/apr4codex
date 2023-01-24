package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
        }
        return result;
    }




#include <iostream>
using namespace std;
int main()
{
    int a,b,c,d;
    cin>>a>>b>>c;
    d=a+b+c;
    if (d==180)
    cout<<"yes";
    else
    cout<<"no";
    return 0;
}
    
}