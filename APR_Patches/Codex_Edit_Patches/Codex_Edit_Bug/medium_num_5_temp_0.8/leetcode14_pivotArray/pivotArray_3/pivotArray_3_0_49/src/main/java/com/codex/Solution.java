package com.codex;

import java.util.*;

public class Solution {
   import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[]=new int[n];
	    int count=0;
	    int t=0,t1=0;
	    for(int i=0;i<n;i++){
	        a[i]=s.nextInt();
	    }
	    int p=s.nextInt();
	    for(int i=0;i<n;i++){
	        if(a[i]<p){
	            t++;
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(a[i]==p){
	            count++;
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(a[i]>p){
	            t1++;
	        }
	    }
	    
	    System.out.println(t+"  "+count+"  "+t1);
	}
}
}