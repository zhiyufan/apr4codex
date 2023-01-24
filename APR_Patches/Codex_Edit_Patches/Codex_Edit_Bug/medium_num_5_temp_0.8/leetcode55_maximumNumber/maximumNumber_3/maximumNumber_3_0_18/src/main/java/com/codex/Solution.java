package com.codex;

import java.util.*;

public class Solution {
#include<bits/stdc++.h>
#define INF 1000000000
#define MAX_N 1000000
#define x first
#define y second
using namespace std;
typedef pair<int,int>P;
int N,K;
int A[MAX_N],B[MAX_N];
int G[MAX_N][MAX_N];
int X[13],Y[13],C[13];
int main()
{
    freopen("input.txt","r",stdin);
    scanf("%d %d",&N,&K);
    for(int i = 0; i < N; i++) scanf("%d",&A[i]);
    for(int i = 0; i < N; i++) scanf("%d",&B[i]);
    for(int i = 0; i < K; i++) scanf("%d %d %d",&X[i],&Y[i],&C[i]);
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
            G[i][j] = -INF;
        }
        G[i][i] = 0;
    }
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < K; j++) {
            G[X[j] - 1][Y[j] - 1] = C[j];
            G[Y[j] - 1][X[j] - 1] = C[j];
        }
    }
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
            for(int k = 0; k < N; k++) {
                G[j][k] = max(G[j][k], G[j][i] + G[i][k]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length; i++) {
            while(ans[i]-- > 0) sb.append(i);
        }
        return sb.toString();
    }

    
}