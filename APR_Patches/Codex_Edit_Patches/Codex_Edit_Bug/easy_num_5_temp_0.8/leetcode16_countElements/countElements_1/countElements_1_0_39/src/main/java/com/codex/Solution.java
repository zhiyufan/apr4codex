package com.codex;

import java.util.*;

public class Solution {
public class file {

    private String fileName;

    public String getfileName() {
        return fileName;
    }

    public void setfileName(String fileName) {
        this.fileName = fileName;
    }

    public static void main(String[] args) {
        file file = new file();
        file.setfileName("D://aaa.txt");
        System.out.println(fileName);

        String fileName1 = "D://aaa.txt";
        String fileName2 = "D://bbb.txt";
        String[] myArray = {fileName1, fileName2};
        System.out.println(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

}

   
}