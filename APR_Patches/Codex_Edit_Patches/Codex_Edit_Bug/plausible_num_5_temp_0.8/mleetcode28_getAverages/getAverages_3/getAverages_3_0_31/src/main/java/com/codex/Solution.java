package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.io.*;

class TestClass {

public static void main(String args[] ) throws Exception 
{
Scanner sc = new Scanner(System.in);
int N;
N=sc.nextInt();
if(N>=1&&N<=100000)
{
 int K;
 K=sc.nextInt();
if(K>=1&&K<=100000&&K<N)
{
  int [] nums = new int[N];
  for(int i=0;i<N;i++)
  {
      nums[i]=sc.nextInt();
  }
  int avgs[] =new int[N];
  avgs=getAverages(nums,K);

  for(int i=0;i<avgs.length;i++)
  {
      System.out.print(avgs[i]+" ");
  }

}
}
}
public static int[] getAverages(int[] nums, int k) 
{
        
int[] avgs = new int[nums.length];
for (int i = k; i < nums.length - k; i++) 
{
int sum = 0;
for (int j = i - k; j <= i + k; j++) 
{
sum += nums[j];

}
avgs[i] = sum / (2*k + 1);
}
return avgs;
}
}
}