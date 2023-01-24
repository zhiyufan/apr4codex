package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
public class sample{
    public static void main(String args[])
    {
        int n=5;
        int[] arr=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int sol[]=new int[n];
        int j=0;
        int val=0;
        int num=0;
        for(int i=0;i<n;i++)
        {
            sol[i]=arr[i];
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    val=arr[i];
                    num=j;
                    if(arr[j]>arr[j-1])
                    {
                        sol[i]=arr[j];
                      
                    }
                    
                 }
               
            }
            i=num;
            j=num;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(sol[i]);
        }
        
       
        
        
    }
    
    }
}