package com.codex;

import java.util.*;

public class Solution {
#include<cstdio>
#include<cstdlib>
#include<algorithm>
#include<cstring>
#include<vector>
#include<queue>
#include<cmath>
#define ll long long
using namespace std;
const int maxn= 2e5;
struct node{
	int l,r,x;
};
int f[maxn];
int l[maxn];
int ans[maxn],vis[maxn];
vector<int> g[maxn];
int n,i,j,x,y,blo;
int find(int o){
	if (f[o]!=o) f[o]= find(f[o]);
	return f[o];
}
void dfs(int o){
	f[o]= o;
	if (find(o)==o){
		l[o]= x++;
	}else l[o]= l[find(o)];
	g[find(o)].push_back(o);
	for (int i= 0;i<g[o].size();i++){
		int v= g[o][i];
		dfs(v);
	}
}
void change(int i,int x){
	int t= find(i);
	for (;i<=n;i= i+i&(-i))
		vis[i]+=x;
}
int ask(int i){
	int re= 0;
	for (;i;i= i-i&(-i))
		re+= vis[i];
	return re;
}
void solve(){
	int i;
	for (i= 1;i<=n;i++)
		if (l[i]!=-1&&ask(n)-ask(l[i])>0)
			ans[g[i][0]]= 1;
}
int main()
{
	freopen("1.in","r",stdin);
	freopen("1.out","w",stdout);
	node Q[maxn];
	scanf("%d",&n);
	for (i= 1;i<=n;i++) scanf("%d",&Q[i].x);
	for (i= 2;i<=n;i++){
		scanf("%d",&x);
		f[i]= x;
		g[x].push_back(i);
	}
	x= 1;
	memset(vis,0,sizeof(vis));
	memset(l,-1,sizeof(l));
	for (i= 1;i<=n;i++){
		if (!f[i]){
			dfs(i);
		}
	}
	int t= 0;
	for (i= 1;i<=n;i++){
		if (l[i]!=-1){
			int sz= g[i].size();
			change(l[i],sz);
			change(l[i]+sz, -sz);
			Q[++t].l= l[i];
			Q[t].r= l[i]+sz-1;
		}
	}
	sort(Q+1,Q+t+1,
	[&](const node &a,const node &b){
		return a.x<b.x;
	}
	);
	int j= 1;
	for (i= 1;i<=n;i++){
		for (;j<=t;j++){
			if (Q[j].x>Q[i].x){
				solve();
				break;
			}else change(Q[j].l,1),change(Q[j].r+1,-1);
		}
		printf("%d ",ans[i]);
	}return 0;
}









        
        
 }
}