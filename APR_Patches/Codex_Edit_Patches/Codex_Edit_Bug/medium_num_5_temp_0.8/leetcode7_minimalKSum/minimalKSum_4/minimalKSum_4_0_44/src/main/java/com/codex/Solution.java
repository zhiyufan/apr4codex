package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int MinSteps(int n) {
        int sum = 0;
        for (int i = 2; i <= Math.Sqrt(n); i++)
        {
            while(n % i == 0)
            {
                sum += i;
                n /= i;
            }
        }

        if(n > 1) sum += n;

        return sum;
    }

}
}