package com.codex;

import java.util.*;

public class Solution {
class file1 implements Cloneable 
{ 
    int rollno; 
    String name; 
  
    file1(int rollno, String name) 
    { 
        this.rollno = rollno; 
        this.name = name; 
    } 
  
    public Object clone() throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
  
    public static void main(String args[]) 
    { 
        try
        { 
            file1 s1 = new file1(101, "amit"); 
  
            file1 s2 = (file1) s1.clone(); 
  
            System.out.println(s1.rollno + " " + s1.name); 
            System.out.println(s2.rollno + " " + s2.name); 
        } 
        catch (CloneNotSupportedException c) 
        { 
        } 
    } 
} 

    
}