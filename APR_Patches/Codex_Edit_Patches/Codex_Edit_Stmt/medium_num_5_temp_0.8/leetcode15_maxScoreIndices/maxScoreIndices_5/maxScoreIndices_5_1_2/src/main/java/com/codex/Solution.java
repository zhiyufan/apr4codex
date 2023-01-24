package com.codex;

import java.util.*;

public class Solution {
        public static List<Integer> indexElements(List<String> lines, int width) {
        if (lines == null || lines.size() == 0 || width == 0) {
            throw new IllegalArgumentException("bad input");
        }
        int lineNumber = 0;
        int index = 0;
        List<Integer> result = new ArrayList<>();
        while (lineNumber < lines.size()) {
            String line = lines.get(lineNumber++);
            if (line.length() == 0) {
                result.add(index);
            } else if (line.length() <= width) {
                index += line.length() + 1;
            } else {
                String[] words = line.split(" ");
                int tempIndex = index;
                for (String word : words) {
                    if (tempIndex - index + word.length() <= width) {
                        tempIndex += word.length() + 1;
                    } else {
                        result.add(index);
                        index = tempIndex;
                        tempIndex += word.length() + 1;
                    }
                }
                index = tempIndex;
            }
        }
        return result;
    } 
}