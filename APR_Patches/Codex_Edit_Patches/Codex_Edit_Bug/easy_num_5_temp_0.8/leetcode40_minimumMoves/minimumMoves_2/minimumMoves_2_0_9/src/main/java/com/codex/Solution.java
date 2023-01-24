package com.codex;

import java.util.*;

public class Solution {
#include<stdio.h>
int main()
{
        char s[50];
        int n,i;
        int count = 0;
        scanf("%d",&n);
        for(i=0;i<n;i++)
        {
        	scanf("%s",s[i]);
        }
        for (int i = 0; i < n - 2; i++) {
            if (s[i] == s[i + 1] && s[i + 1] == s[i + 2] && s[i] == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
        printf("%d\n",count);
}
}