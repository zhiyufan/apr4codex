package com.codex;

import java.util.*;

public class Solution {
 int minimumBuckets(String street) {
         int bucketsCount=0;
         int houseCount=0;
         char[] array = street.toCharArray();
         for(int i=0;i<array.length;i++)
        	 {
        	 if(array[i]=='.')
        		 {
        		 if(i+1<street.length() && array[i+1]=='H')
        			 {
        			 bucketsCount++;
        			 i++;
        			 }
        		 else if(i>0 && array[i-1]!='.')
        			 {
        			 return -1;
        			 }
        		 else
        			 {
        			 bucketsCount++;
        			 }
        		 }
        	 else if(array[i]=='H')
        		 {
        		 if(i==0 || i+1==street.length())
        			 {
        			 houseCount++;
        			 }
        		 else if(array[i-1]=='.' && array[i+1]=='.')
        			 {
        			 houseCount++;
        			 }
        		 else
        			 {
        			 return -1;
        			 }
        		 }
        	 else
        		 {
        		 return -1;
        		 }
        	 }
         if(houseCount==0)
        	 {
        	 return 0;
        	 }
         return bucketsCount;
     }
}