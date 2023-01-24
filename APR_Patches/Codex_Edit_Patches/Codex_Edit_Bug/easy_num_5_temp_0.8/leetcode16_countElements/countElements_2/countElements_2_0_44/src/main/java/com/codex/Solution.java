package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] plusOn(int[] arr, int n) 
    { 
     int[] newArr=new int[arr.length];
     int pos=0;
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]==n)
         {
             pos=i;
             break;
         }
     }
     for(int i=0;i<arr.length;i++)
     {
         if(i==pos)newArr[i]=arr[i]+1;
         else newArr[i]=arr[i];
     }
      return newArr; 
    } 
}

    
}