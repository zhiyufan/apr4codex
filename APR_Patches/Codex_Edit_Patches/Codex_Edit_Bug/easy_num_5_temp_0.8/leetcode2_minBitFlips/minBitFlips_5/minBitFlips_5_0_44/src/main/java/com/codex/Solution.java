package com.codex;

import java.util.*;

public class Solution {

package cumhur;

import java.util.Scanner;

/**
 *
 * @author ada
 */
public class Cumhur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[30];
        for (int i=0; i<a.length ; i++)
        {
            a[i] = Integer.bitCount(i+1)^i+1;
        }
        
        for(int i=0; i<a.length; i++)
        System.out.print(a[i] + " ");
    }
}
}