package com.codex;

import java.util.*;

public class Solution {
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{	
		int n;
		cin>>n;
		int a[n+1];
		for(int i=0;i<n;i++)
			cin>>a[i];
		int q;
		cin>>q;
		while(q--)
		{
			int l,r;
			cin>>l>>r;
			l--;r--;
			int max_ele=a[l];
			while(l<=r)
			{
				max_ele=max(max_ele,a[l]);
				l++;
			}
			cout<<max_ele<<"\n";
		}
	}
	return 0;
}
}