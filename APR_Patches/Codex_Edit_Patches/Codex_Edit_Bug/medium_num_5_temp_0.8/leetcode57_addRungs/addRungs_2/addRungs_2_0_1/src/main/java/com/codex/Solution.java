package com.codex;

import java.util.*;

public class Solution {
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int cases=0;
    int cases2=0;
    scanf("%d",&cases);
    while(cases--){
        int n=0,m=0;
        int x[10000];
        int i=0;
        int count=0;
        scanf("%d%d",&n,&m);
        for(i=0;i<n;i++){
            scanf("%d",&x[i]);
        }
        for(i=0;i<(n-1);i++){
            if((x[i+1]-x[i])>m){
                count = count + ((x[i+1]-x[i])/m)+1;
            }
        }
        cases2++;
        printf("Case #%d: %d\n",cases2,count);
    }
    return 0;
}
















// public static int addRungs(int[] rungs, int dist) {
        
//     int add = 0;
//     for (int i = 1; i < rungs.length; ) {
//         if (rungs[i] - rungs[i - 1] > dist) {
//             add++;
//             rungs[i] = rungs[i - 1] + dist;
//         } else {
//             i++;
//         }
//     }
//     return add;
// }

    
}