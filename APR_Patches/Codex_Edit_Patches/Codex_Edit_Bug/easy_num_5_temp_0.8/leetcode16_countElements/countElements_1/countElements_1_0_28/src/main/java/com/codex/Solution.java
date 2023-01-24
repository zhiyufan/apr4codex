package com.codex;

import java.util.*;

public class Solution {
    public static int number (int[] array){
        
        int count = 0 ;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[j] == array[i] +1){
                    count++ ;
                    break;
                }
            }
        }
        return count;
    }
}