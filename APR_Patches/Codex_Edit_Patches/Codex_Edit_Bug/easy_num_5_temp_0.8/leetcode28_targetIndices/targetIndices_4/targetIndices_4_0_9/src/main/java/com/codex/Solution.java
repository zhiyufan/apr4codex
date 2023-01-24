package com.codex;

import java.util.*;

public class Solution {
public class Test
{
	public static void main(String[] args)
	{
		int n = 15;
		String s = Integer.toString(n,2);
		System.out.println(s);
		int numOfOnes = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == '1')
				numOfOnes++;
		}
		
		System.out.println(numOfOnes);
	}
}