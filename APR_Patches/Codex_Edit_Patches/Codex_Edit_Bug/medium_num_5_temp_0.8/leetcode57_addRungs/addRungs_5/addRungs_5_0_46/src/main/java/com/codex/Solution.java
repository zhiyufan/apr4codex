package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
import java.util.Random;
public class test {
	
	public int min(int arr[],int n)
	{
		int min=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<arr[min])
			{
				min=i;
			}
		}
		return min;
	}
	
	public int max(int arr[],int n)
	{
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>arr[max])
			{
				max=i;
			}
		}
		return max;
	}
	
	public int[] getRandomArray(int n)
	{
		int arr[]=new int[n];
		Random rand=new Random();
		for(int i=0;i<n;i++)
		{
			arr[i]=rand.nextInt(1000);
		}
		return arr;
		
	}
	
	public int[] getSortedArray(int n)
	{
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i;
		}
		return arr;
	}
	
	public int addRung(int[] rungs, int dist)
	{
		int count=0;
		int n=rungs.length;
		int min=min(rungs,n);
		int max=max(rungs,n);
		Arrays.sort(rungs);
		if(rungs[0]-rungs[min]>dist)
		{
			count++;
		}
		else
		{
			
		}
		
		for(int i=0;i<n;i++)
		{
			
		}
		
		
		return count;
	}
		
	public static void main(String[] args)
	{
		test test=new test();
		int n=10;
		int arr[]=test.getRandomArray(n);
		System.out.println("Unsorted Array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
}