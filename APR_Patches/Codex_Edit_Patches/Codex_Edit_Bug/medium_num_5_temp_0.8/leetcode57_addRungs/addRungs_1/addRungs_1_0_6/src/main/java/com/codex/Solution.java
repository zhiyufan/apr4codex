package com.codex;

import java.util.*;

public class Solution {
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int l, d;
    scanf("%d %d", &l, &d);
    int rungs[l];
    int firstRung;
    scanf("%d", &firstRung);
    rungs[0] = firstRung;
    for (int i = 0; i < l - 1; i++) {
        int rung;
        scanf("%d", &rung);
        rungs[i+1] = rung;
    }
    //int rungs[3] = {0, 5, 10};
    //int dist = 1;
    int count = 0;
    int i;
    for (i = 1; i < l - 1; i++) {
        count += (rungs[i] - rungs[i-1]) / d + 1;
        rungs[i] = rungs[i] - (rungs[i] - rungs[i-1]) % d;
        //printf("%d ", rungs[i]);
    }
    //printf("%d\n", rungs[i]);
    if (rungs[l-1] - rungs[i-1] > d) {
        count += 1;
    }
    printf("%d\n", count);
    return 0;
}



/*
    int addRungs(int[] rungs, int dist) {

        if (rungs[0] > dist) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i-1] > dist) {
                count++;
            }
*/
//printf("%d ", (int)ceil((float)(rungs[i] - rungs[i-1])/dist));




        }
        return count;
    }

    
}