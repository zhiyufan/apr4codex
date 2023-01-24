package com.codex;

import java.util.*;

public class Solution {

#include<iostream>
#include<vector>

using namespace std;

int main()
{
    int n;
    cin>>n;
    for(int i=0;i<n;i++)
    {
    int rungs;
    cin>>rungs;
    vector<int> v;
    for(int j=0;j<rungs;j++)
    {
        int k;
        cin>>k;
        v.push_back(k);
    }
    int final=0;
    vector<int> finalArray;
    for(int p=1;p<=rungs;p++)
    {
        int k=0;
        int temp=p;
        for(int q=0;q<rungs;q++)
        {
            if(v[q]>k&&v[q]<=temp)
            {
                k=v[q];
                temp=k+p;
            }
        }
        return rungsAdded;
    }

    
}