package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0){
            String s = sc.next();
            System.out.println(minimumMoves(s));
        }
    }

    public static int minimumMoves(String s){

        s = s.replaceAll("OO", "X");
        int c = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}