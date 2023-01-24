package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.lang.*;
public class HelloWorld{

     public static void main(String []args){
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] result = new int[3][3];
        int count = 0; // for index of original array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = original[count++];
            }
        }
        // print th array
        System.out.println(Arrays.deepToString(result).replace("], ", "]\n"));
    }
}

    
}