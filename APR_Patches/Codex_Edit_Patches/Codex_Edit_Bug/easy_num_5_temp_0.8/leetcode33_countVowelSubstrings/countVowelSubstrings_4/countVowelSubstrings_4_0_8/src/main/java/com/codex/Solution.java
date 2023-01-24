package com.codex;

import java.util.*;

public class Solution {
import java.io.File

public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sje\\Downloads\\file.txt");
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.toPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
        System.out.println(file.toURI());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getUsableSpace());
        System.out.println(file.getFreeSpace());
        System.out.println(file.lastModified());
        System.out.println(file.compareTo(file));
        System.out.println(file.compareTo(file));
        System.out.println("============================");
        File file2 = new File("file.txt");
        System.out.println(file2.length());
        System.out.println(file2.getName());
        System.out.println(file2.getPath());
        System.out.println(file2.toPath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.isAbsolute());
        System.out.println(file2.isDirectory());
        System.out.println(file2.exists());
        System.out.println(file2.canExecute());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());
        System.out.println(file2.toURI());
        System.out.println(file2.getTotalSpace());
        System.out.println(file2.getUsableSpace());
        System.out.println(file2.getFreeSpace());
        System.out.println(file2.lastModified());
        System.out.println(file2.compareTo(file2));
        System.out.println(file2.compareTo(file2));
        System.out.println("============================");
        File file3 = new File("/usr/bin");
        File[] list = file3.listFiles();
        for (File file4 : list) {
            File file5 = new File(file4.toString());
            if (file5.isDirectory()) {
                System.out.println("[" + file4.getName() + "]");
            } else {
                System.out.println(file4.getName());
            }
        }
        return count;
    }

    private static boolean containsVowels(String word) {
        boolean a = false, e = false, i = false, o = false, u = false;
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                a = true;
            }
            if (c == 'e') {
                e = true;
            }
            if (c == 'i') {
                i = true;
            }
            if (c == 'o') {
                o = true;
            }
            if (c == 'u') {
                u = true;
            }
        }
        return a && e && i && o && u;
    }

    
}