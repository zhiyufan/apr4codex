package com.codex;

import java.util.*;

public class Solution {
int getLucky(String s, int k)
{
    int ans = 0;
    for (int i = 0; i < s.length(); i++)
    {
        ans += (s.charAt(i) - 'a' + 1);
    }
    while (k > 0)
    {
        int temp = 0;
        while (ans > 0)
        {
            temp += ans % 10;
            ans /= 10;
        }
    return ans;
}

        ans = temp;
        k--;
    }
}