package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i] + 1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }



public static void main(String[] args) {
		String s="Aab";
		System.out.println(toLowercase(s));
	}
    public static String toLowercase(String str) {
    	char ch[]=str.toCharArray();
    	char ch1[]=new char[ch.length];
    	for(int i=0;i<ch.length;i++)
    	{
    		if(ch[i]>='A' && ch[i]<='Z')
    		{
    			ch1[i]=(char) (ch[i]+32);
    		}
    		else
    			ch1[i]=ch[i];
    	}
    	return new String(ch1);
    		
    }
    
}