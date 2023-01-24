package com.codex;

import java.util.*;

public class Solution {
public void mergeSortedArray(int[] arrayOne,
                             int[] arrayTwo,
                             int[] mergedArray,
                             int m,
                             int n) {
    int p1 = 0;
    int p2 = 0;
    while(p1 + p2 < m + n){
        if(p1 == m){
            mergedArray[p1 + p2] = arrayTwo[p2];
            p2++;
        }
        else if(p2 == n){
            mergedArray[p1 + p2] = arrayOne[p1];
            p1++;
        }
        else if(arrayOne[p1] < arrayTwo[p2]){
            mergedArray[p1 + p2] = arrayOne[p1];
            p1++;
        }
        else{
            mergedArray[p1 + p2] = arrayTwo[p2];
            p2++;
        }
    }

}
}