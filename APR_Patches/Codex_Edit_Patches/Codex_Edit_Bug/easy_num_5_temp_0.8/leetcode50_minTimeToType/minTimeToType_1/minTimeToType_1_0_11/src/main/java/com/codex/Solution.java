package com.codex;

import java.util.*;

public class Solution {
public static void writeFile(String fileName) {
    File file = new File(fileName);
    FileWriter fw;
    try {
        fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(toWrite);
}
        bw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}