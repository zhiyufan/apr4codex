package com.codex;

import java.util.*;

public class Solution {
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        

        int start,goal;
        cin >> start >> goal;
        
        int n = start;
        int m = goal;
        int ans = 0;
        int count = 0;
        while (n > 0 || m > 0) {
            int b1 = n & 1;
            int b2 = m & 1;
            if (b1 != b2) {
                count++;
            } else {
                ans += count / 2;
                count = 0;
            }
            n /= 2;
            m /= 2;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }    
    }

}
}