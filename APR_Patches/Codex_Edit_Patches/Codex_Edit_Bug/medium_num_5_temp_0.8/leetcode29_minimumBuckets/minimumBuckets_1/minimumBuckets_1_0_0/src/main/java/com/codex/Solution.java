package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String street = in.next();

        int result = minimumBuckets(street);

        System.out.println(result);

    }

     public static int minimumBuckets(String street) {
        
        int[] res = new int[street.length()];

        for (int i = 0; i < street.length(); i++) {
            if (i == 0 && street.charAt(i) == '.') {
                res[i] = 1;
            }
            else if (i == street.length() - 1 && street.charAt(i) == '.') {   
                res[i] = 1; 
            } 
            else if (street.charAt(i) == '.') {             
                if (street.charAt(i-1) == 'H' && street.charAt(i+1) == 'H') {  
                    res[i] = 2;
                }
                if (street.charAt(i-1) == 'H' && street.charAt(i+1) == '.') {  
                    if (res[i+1] == 1) {
                        res[i] = 1;
                    }
                    else if (res[i+1] == 2) {
                        res[i] = 1;
                    }
                    else if (res[i+1] == 1) {
                        res[i] = 1;
                    }
					else if (res[i+1] == 0) {
                        res[i] = 1;
					}
                }
                if (street.charAt(i-1) == '.' && street.charAt(i+1) == 'H') { 
                    if (res[i-1] == 1) {
                        res[i] = 1;
                    }
                    else if (res[i-1] == 2) {
                        res[i] = 2;
                    }
                    else if (res[i-1] == 0) {
                        res[i] = 1;
                    }
                    else if (res[i-1] == 1) {
                        res[i] = 1;
                    }
                }
            }
        }
        if (street.charAt(street.length()-1) == 'H') {
            res[street.length()-1] = 0;
            if (street.charAt(street.length()-2) == 'H') {
                res[street.length()-2] = 0;
            }
           

        }
        int output = 0;
        for (int i =0; i < res.length; i++) {
            if (res[i] == 2) {
                output += 1;
            
            }
        }

        return output;

    
    }
}