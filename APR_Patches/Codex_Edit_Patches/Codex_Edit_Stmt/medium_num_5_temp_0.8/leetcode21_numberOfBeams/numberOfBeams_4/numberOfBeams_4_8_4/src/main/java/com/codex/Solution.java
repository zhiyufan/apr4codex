package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Test{
    public static void main(String[] args) {

        int[] arr = {2,3,4,5};
        int[] arr2 = {5,4,3,2};

        for(int i = 0; i < arr.length; ++i){
            if(arr[i] < arr2[i]){
                System.out.println("true");
            } else if(arr[i] > arr2[i]){
                System.out.println("false");
            }
        }

    }

}
}