package com.codex;

import java.util.*;

public class Solution {
public static int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length==0){return new int[0][0];}
        int[][] result = new int[m][n];int p = 0;
		for(int i=0;i<result.length;i++){
		    for(int j=0;j<result[0].length;j++){
			if(p<original.length){result[i][j]=original[p++];}
			else{return result;}
		    }
		}
}