package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    int index = 0;

		    while(n-- > 0)
		    {
		        arr[index++] = sc.nextInt();
		    }

		    int x = sc.nextInt();
		    int sum = 0;
		    for(int i = 0; i < arr.length; i++)
		    {
		        if(arr[i] == x)
		        {
		            sum = i;
		            break;
		        }
		    }
        
		    System.out.println(sum);
        }
    }

}
}