package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class HillValley{
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int count=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }
    for(int i=1;i<n-1;i++)
    {
        if(a[i-1]>a[i]&&a[i]<a[i+1])
        {
            count++;
        }
        else if(a[i-1]<a[i]&&a[i]>a[i+1])
        {
            count++;
        }

    }
    System.out.print(count);
}
}
}