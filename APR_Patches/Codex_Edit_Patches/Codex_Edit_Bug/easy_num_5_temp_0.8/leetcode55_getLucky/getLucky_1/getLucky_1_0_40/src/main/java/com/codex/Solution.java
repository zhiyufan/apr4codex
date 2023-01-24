package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - 'a' + 1);
        }
        for (int i = 0; i < k; i++) {
            int temp = 0;
            while (result > 0) {
                temp += result % 10;
                result /= 10;
            }
            result = temp;
        }
        return result;
    int getTotalX(vector<int> a, vector<int> b) {

    int lcm = 0;
    int gcd = 0;
    int count = 0;
    lcm = lcm_of_array(a, a.size());
    gcd = gcd_of_array(b, b.size());

    for (int i = lcm, j =2; i <= gcd; i = lcm*j, j++)
        if (gcd % i == 0)
            count++;

    return count;
}

int gcd_of_array(vector<int>num, int n)
{
    int result = num[0];
    for (int i = 1; i < n; i++)
        result = gcd(num[i], result);

    return result;
}

int gcd(int a, int b)
{
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

int lcm_of_array(vector<int>num, int n)
{
    int ans = num[0];
    for (int i = 1; i < n; i++)
        ans = (((num[i] * ans)) /
                (gcd(num[i], ans)));

    return ans;
}
    }

    
}