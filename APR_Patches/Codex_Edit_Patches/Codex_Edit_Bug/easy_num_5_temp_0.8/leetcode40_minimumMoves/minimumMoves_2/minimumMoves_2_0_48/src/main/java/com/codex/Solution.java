package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += in.nextInt();
        }
        in.close();

        System.out.println((int) Math.ceil(sum * 1.5f / n));
    }
}

    public static int minimumMoves(String s){

        int count = 0;
        for(int i = 0 ; i < s.length()-2 ; i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2) && s.charAt(i)=='X'){
                count++;
                i += 2;
            }
        }
        return count;
    }

    
}