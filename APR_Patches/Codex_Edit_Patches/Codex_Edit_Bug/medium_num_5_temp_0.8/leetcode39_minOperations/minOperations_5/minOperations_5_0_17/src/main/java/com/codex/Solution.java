package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;
import java.util.Stack;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		Stack<Integer> stk=new Stack<>();
		stk.push(arr[0]);
		for(int i=1;i<n;i++)
		{	
			arr[i]=sc.nextInt();
			if(arr[i]>arr[i-1])
			{	
				stk.push(arr[i]);
				
			}
			else
			{
				while(!stk.isEmpty())
				{
					if(stk.peek()>arr[i])
					{
						stk.pop();
					}
					else
					{
						if(!stk.isEmpty())
						{
							stk.pop();
						}
						stk.push(arr[i]);
						break;
					}
				}
			}
		}
		System.out.println(stk.size());
	}
}
}