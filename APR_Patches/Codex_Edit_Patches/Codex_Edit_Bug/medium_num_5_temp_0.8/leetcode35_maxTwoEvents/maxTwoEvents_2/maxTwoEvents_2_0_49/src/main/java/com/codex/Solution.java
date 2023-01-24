package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n == 0) return 0;
        int[][] dp = new int[n][3];
        int ans = 0;
        dp[0][0] = 0;
        dp[0][1] = events[0][2];
        dp[0][2] = events[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = events[i][2] + dp[i-1][1];
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
        }
        return ans;
    }

    #include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *left;
    struct node *right;
}typedef node;

node *createNode(int data){
    node *p = (node*)malloc(sizeof(node));
    p->data = data;
    p->left = NULL;
    p->right = NULL;
    return p;
}

node * buildTree(int *in, int *pre, int s, int e, int *index){
    if(s>e) return NULL;
    node *root = createNode(pre[*index]);
    (*index)++;
    int i=-1;
    for(i=s; i<=e; i++){
        if(in[i] == root->data) break;
    }
    root->left = buildTree(in, pre, s, i-1, index);
    root->right = buildTree(in, pre, i+1, e, index);
    return root;
}

node *buildTreeDriver(int *in, int *pre, int n){
    int index = 0;
    return buildTree(in, pre, 0, n-1, &index);
}

void inorder(node *root){
    if(root == NULL) return;
    inorder(root->left);
    printf("%d ", root->data);
    inorder(root->right);
}

int main(){
    int in[] = {4, 2, 5, 1, 6, 7, 3};
    int pre[] = {1, 2, 4, 5, 3, 7, 6};
    node *root = buildTreeDriver(in, pre, 7);
    inorder(root);
    return 0;
}
}