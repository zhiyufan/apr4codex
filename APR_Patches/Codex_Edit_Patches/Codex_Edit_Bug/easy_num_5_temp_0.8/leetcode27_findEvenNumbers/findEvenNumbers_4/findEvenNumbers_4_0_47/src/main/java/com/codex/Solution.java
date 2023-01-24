package com.codex;

import java.util.*;

public class Solution {
package com.kode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] digits = {1,2,4};
        System.out.println(Arrays.toString(findEvenNumbers(digits)));
    }

    public static int[] findEvenNumbers(int[] digits)
    {
        int[] result=new int[2];
        int temp=0;
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                for(int k=j+1;k<5;k++)
                {
                    int evenNumber = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if(evenNumber%2==0 && temp<2)
                    {
                        result[temp]=evenNumber;
                        temp++;
                    }
                }
            }
        }
        return result;
    }

    
}