package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        if (original.length != m * n) return result;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[count];
                count++;
            }
        }
        return result;
    }
    /*  public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if (original.length != m * n) return result;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[count];
                count++;
            }
        }
        return result;
    } */

    /**
     * 
     */
    
    public static int inc(int i) {
        return i++;
    }
    
    public static void main(String []args){
        int x = 1;
        int y = 1;
        int z = inc(x+y);
        System.out.println(z);
    }
    
    public void Student(){
        
    }
    
    public void Student(String name){
        this.name = name;
    }
    
    public void Student(int id){
        this.id = id;
    }
    
    public void Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public void Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    
    public void Student(String n, int i){
        name = n;
        id = i;
    }
    
}