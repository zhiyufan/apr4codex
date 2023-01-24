package com.codex;

import java.util.*;

public class Solution {
    int main()
{
   int i,j,m,n,a[50][50],max=0;
   printf("Enter the order of the matix \n");
   scanf("%d %d",&m,&n);
   printf("Enter the coeffiecients of the matix \n");
   for(i=0;i<m;i++)
   {
      for(j=0;j<n;j++)
	  {
	     scanf("%d",&a[i][j]);
	  }
   }
   printf("matix is \n");
   for(i=0;i<m;i++)
   {
      for(j=0;j<n;j++)
	  {
	      printf("%4d",a[i][j]);
	  }
	  printf("\n");
   }
   for(j=0;j<n;j++)
   {
      for(i=0;i<m;i++)
	  {
	     max=max+a[i][j];
	  }
	  printf("Sum of the coloum %d=%d\n",j+1,max);
      max=0;
   }
   return(0);
}
}