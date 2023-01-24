package com.codex;

import java.util.*;

public class Solution {

#include<iostream>
using namespace std;
int main()
{
    int i,j,n,count=0,k=1;
    cin>>n;
    int *a=new int(n);
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        if(a[i]==k)
            {
            k++;
            }
        else
        {
            count++;
        }
    }
    cout<<count;

    return 0;
}





























        
}