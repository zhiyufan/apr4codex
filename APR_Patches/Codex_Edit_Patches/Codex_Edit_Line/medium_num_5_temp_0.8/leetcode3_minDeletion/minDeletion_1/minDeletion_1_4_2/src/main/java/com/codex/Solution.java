package com.codex;

import java.util.*;

public class Solution {
<<<<<<< HEAD
    public static int minDeletion(int[] nums) {
        

        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] % 2 == 0) {
                if (nums[i] == nums[i+1]) {
                    count++;
                }
            } else {
                if (nums[i] != nums[i+1]) {
                    count++;
                }
            }
        }
        return count;
=======
#include<stdio.h>
int main()
{
	int a[10],i,n,pos,x;
	printf("enter the number of element:");
	scanf("%d",&n);
	printf("enter the elements:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter the position to be deleted:");
	scanf("%d",&pos);
	for(i=pos-1;i<n-1;i++)
	{
		a[i]=a[i+1];
	}
	printf("the new array is:");
	for(i=0;i<n-1;i++)
	{
		printf("%d",a[i]);
	}
}
>>>>>>> 4a4c4d4a557f9b7c0d1b66a604e078b874a0dc77
    }

    
}