package com.codex;

import java.util.*;

public class Solution {
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileReaderDemo {
     public static void main(String args[]){    
          try{    
            File file =new File("D:\\testout.txt");    
            FileReader fr = new FileReader(file);    
           int i;    
           while((i=fr.read())!=-1)    
           System.out.print((char)i);    
           fr.close();    
          }
          catch(Exception e){
              System.out.println(e);}    
            
          }    
    }
}