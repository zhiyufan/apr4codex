package com.codex;

import java.util.*;

public class Solution {
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileUtils {
    public static void main(String[] args) {

      System.out.println(findUnusedFunctions("/home/max/CPP_Projects/NSE_Matcher/src"));

    }

    public static Map<String, List<String>> findUnusedFunctions(String directory) {

        // store our functions and file names in a map
        Map<String, List<String>> functionToFile = new HashMap<>();

        // first map functions to files

      final File root = new File(directory);
      FunctionFinder.findFunctions(root, new FunctionCallback() {
        @Override
        public void handleFunction(String fileName, String function) {

          List<String> listFiles = functionToFile.get(function);

          if(listFiles == null){
            listFiles = new ArrayList<>();
          }

          listFiles.add(fileName);
          functionToFile.put(function, listFiles);
        }
      });


      // then cross-references with the includes
      IncludeFinder.findIncludes(root, new IncludeCallback() {
        @Override
        public void handleInclude(String fileName, String includedFile) {
          // remove all the functions in the included file

          List<String> listFiles = functionToFile.get(includedFile);
          if(listFiles != null){
            functionToFile.remove(includedFile);
          }

        }
      });

      return functionToFile;
    }


}
    
    
}