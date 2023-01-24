package com.codex;

import java.util.*;

public class Solution {
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <math.h>

int main(int argc, char const *argv[])
{
    int n = argc - 1;
    int8_t* a = malloc(sizeof(int8_t) * n);
    for (int i = 0; i < n; ++i)
    {
        a[i] = atoi(argv[i + 1]);
    }
    int sum = 0;
    for (int i = 0; i < n; ++i)
    {
        sum += a[i];
    }
    int m1 = (int) round((double) sum/(n + 1));
    int m2 = (int) ceil((double) sum/(n + 1));
    int j = 0;
    int l = 0;
    int r = n - 1;
    while (j <= r)
    {
        if (a[j] == m1)
        {
            j++;
            continue;
        }
        if (a[j] == m2)
        {
            if (a[l] == m1)
            {
                j++;
                l++;
                continue;
            }
            else
            {
                int t = a[l];
                a[l] = a[j];
                a[j] = t;
                l++;
            }
        }
        if (a[j] < m1)
        {
            int t = a[j];
            a[j] = a[l];
            a[l] = t;
            l++;
        }
        else
        {
            int t = a[j];
            a[j] = a[r];
            a[r] = t;
            r--;
        }
        
    }

    for (int i = 0; i < n; ++i)
    {
        printf("%d ", a[i]);
    }
    printf("%d %d\n", m1, m2);
    return 0;
}

}