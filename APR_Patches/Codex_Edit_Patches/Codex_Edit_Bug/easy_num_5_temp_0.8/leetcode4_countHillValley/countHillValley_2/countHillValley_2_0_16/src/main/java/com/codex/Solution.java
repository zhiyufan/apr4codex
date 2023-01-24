package com.codex;

import java.util.*;

public class Solution {
package file;

import java.io.File;

public class ReadTree {
   
    	public static void listFilesAndFolders(String directoryName){
    		 
    		File directory = new File(directoryName);
    		
    		//get all the files from a directory
    		File[] fList = directory.listFiles();
    		
    		for (File file : fList){
    			System.out.println(file.getName());
    		}
    	}
    	
    	

    
}