package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.io.*;

class MinSum {

    public static double minimumSum(int num) {
        try{
            double minSum = Double.MAX_VALUE;
            String numStr = String.valueOf(num);
            for (int i = 1; i < numStr.length(); i++) {
                double num1 = Double.valueOf(numStr.substring(0, i));
                double num2 = Double.valueOf(numStr.substring(i, numStr.length()));
                minSum = Math.min(minSum, num1 + num2);
            }
            return minSum;
        }
        catch(Exception e)
        {
            return 0;
        }
    }

     public static void main(String args[])
     {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            if(input == null || "".equals(input)){
                System.out.println("0");
            }
            else {
                int num = Integer.parseInt(input);
                System.out.println(minimumSum(num));
            }
        }
        catch(Exception e)
        {
            System.out.println("0");
        }
     }
}


    
}