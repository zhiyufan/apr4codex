package com.codex;

import java.util.*;

public class Solution {
package com.java.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\a\\b\\c");
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
        File f = new File("C:\\a\\b\\hello.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] buffer = new char[20];
        List<Character> l = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int readCount = 0;
            e.printStackTrace();
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            try {
                readCount = fr.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (readCount == -1) break;
            for (int i = 0; i < readCount; i++) {
                l.add(buffer[i]);
            }
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;
    }

    
}