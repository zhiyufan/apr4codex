package com.codex;

import java.util.*;

public class Solution {
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package a1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eshan
 */
public class A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int n = Integer.parseInt(inputs[0]);
            int q = Integer.parseInt(inputs[1]);
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(Integer.parseInt(br.readLine()));
        }
        return res;
    }

    
}