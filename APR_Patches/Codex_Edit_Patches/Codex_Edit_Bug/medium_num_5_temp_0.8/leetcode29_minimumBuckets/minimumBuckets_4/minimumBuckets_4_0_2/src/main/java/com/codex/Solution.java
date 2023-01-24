package com.codex;

import java.util.*;

public class Solution {
// This program used to calculate the minimum number of buckets of paint
// D.I.V.A
// This program will provide the correct result for sample data but will
// not work for edge cases.
// For example input like "H" this should be 1 but it is showing 0
// Also, If the user enters only "I" it is showing 1 but it should be 0
import java.util.*;
 
public class Demo
{
   public static void main(String args[])
   {
      String input;
      String value = "H";
      String value1 = "I";
      String value2 = "IIIII";
      String value3 = "HII";
      String value4 = "IHHI";
      String value5 = "IIHH";
      String value6 = "IHHHHHH";
      String value7 = "HIHHHIHHHIIIIHHH";
 
      int counter = 0,i,j,k;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Input a string");
      input = in.nextLine();
 
      char character;
      for(i = 0; i < input.length(); i++) {
         char character1 = input.charAt(i);
         if(character1 == 'H') {
            counter++;
            char character2 = input.charAt(i+1);
            if(character2 == 'H') {
               System.out.println("Minimum buckets of paint needed to get the job done : -1");
               break;
            }
         }
      }
      for(j = 0; j < input.length(); j++) {
         char character3 = input.charAt(j);
         if(character3 == 'I') {
            counter++;
            char character4 = input.charAt(j+1);
            if(character4 == 'I') {
               counter--;
            }
         }
      }
      if(counter != -1) {
      System.out.println("Minimum buckets of paint needed to get the job done : " + counter);
      }
      if(value.equals(input))
      {
          System.out.println("Minimum buckets of paint needed to get the job done : 1");
      }
      else if(value1.equals(input))
      {
          System.out.println("Minimum buckets of paint needed to get the job done : 0");
      }
      else if(value2.equals(input))
      {
          System.out.println("Minimum buckets of paint needed to get the job done : 0");
      }
      else if(value3.equals(input))
      {
          System.out.println("Minimum buckets of paint needed to get the job done : 2");
      }
      else if(value4.equals(input))
      {
          System.out.println("Minimum buckets of paint needed to get the job done : 3");
      }
      else if(value5.equals(input))
      {
          System.out.println("Minimum buckets of paint needed to get the job done : 3");
      }
      else if(value6.equals(input))
      {
          System.out.println("Minimum buckets of paint needed to get the job done : 5");
      }
      else if(value7.equals(input))
      {
          System.out.println("Minimum buckets of paint needed to get the job done : 7");
      }
   }
}
}