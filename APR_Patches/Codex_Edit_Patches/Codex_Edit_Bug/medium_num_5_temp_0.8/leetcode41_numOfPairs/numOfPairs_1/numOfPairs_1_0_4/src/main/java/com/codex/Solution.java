package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        int index = 0;
        for(int i=0; i<a.length; i++) b[index++] = a[i];
        for(int i=0; i<a.length; i++) a[i] = a[index++];
         for(int i=0; i<a.length; i++) System.out.print(a[i]+" ");
    }
}