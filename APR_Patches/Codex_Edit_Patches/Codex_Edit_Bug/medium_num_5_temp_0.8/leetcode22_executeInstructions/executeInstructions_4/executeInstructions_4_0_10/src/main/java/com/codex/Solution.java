package com.codex;

import java.util.*;

public class Solution {
 #include<iostream>
#include<cmath>
#include<algorithm>
#include<vector>
#include<string>
#include <bitset>
#include<bits/stdc++.h>

using namespace std;
typedef long long int ll;
typedef unsigned long long int ull;
#define M 1000000007
ll n, m;
int a[100001];
#define pb push_back
vector<int> v[100001];
void dfs(int s, int par)
{
	if (a[s])
	{
		for (int i = 0; i < v[s].size(); i++)
		{
			if (v[s][i] != par)
			{
				a[v[s][i]] = a[s] + 1;
				dfs(v[s][i], s);
			}
		}
	}
}
void solve()
{
	cin >> n;
	for (int i = 0; i < n - 1; i++)
	{
		int x, y;
		cin >> x >> y;
		v[x].pb(y);
		v[y].pb(x);
	}
	cin >> m;
	for (int i = 0; i < m; i++)
	{
		int x;
		cin >> x;
		a[x] = 1;
	}
	dfs(1, -1);
	for (int i = 1; i <= n; i++)
	{
		cout << a[i] << " ";
	}
	cout << endl;
}
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif
	int t;
	cin >> t;
	while (t--)
	{
		solve();
	}
	return 0;
}
}