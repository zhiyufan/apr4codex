package com.codex;

import java.util.*;

public class Solution {
public class Solution {

  /**
   * This method reads the input file with name filePath. It reads the file line
   * by line and returns the lines in an ArrayList
   * 
   * @param filePath
   *          is the path to the file to be read
   * @return arrayList of strings, each string being a line in the file
   */

  public static ArrayList<String> readFile(String filePath) {
    ArrayList<String> fileContents = new ArrayList<>();
    try {
      File file = new File(filePath);
      Scanner in = new Scanner(file);
      while (in.hasNextLine()) {
        String line = in.nextLine();
        fileContents.add(line);
      }
      in.close();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    return fileContents;
  }

  /**
   * This method reads the input file with name filePath. It reads the file line
   * by line, parses each line as an array of Integer, and returns the 2D array
   * of input integers
   * 
   * @param filePath
   *          is the path to the file to be read
   * @return 2D array of integers given in the input file
   */

  public static int[][] read2DArrayFromFile(String filePath) {
    int[][] input = null;
    try {
      File file = new File(filePath);
      Scanner in = new Scanner(file);
      int m = in.nextInt();
      int n = in.nextInt();
      in.nextLine();
      input = new int[m][n];
      int i = 0;
      while (in.hasNextLine()) {
        String line = in.nextLine();
        String[] tokens = line.split(" ");
        for (int j = 0; j < tokens.length; j++) {
          input[i][j] = Integer.parseInt(tokens[j]);
        }
        i++;
      }
      in.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return input;
  }

  /**
   * This method writes matrix to a file
   * 
   * @param matrix
   *          is the 2D array to be written to a file
   * @param filePath
   *          is the path to the output file
   */
  public static void write2DArrayToFile(int[][] matrix, String filePath) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          writer.write(matrix[i][j] + " ");
        }
        writer.write("\n");
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * This method reads the input array from standard input
   * 
   * @return 2D array of integers read from standard input
   */
  public static int[][] read2DArrayFromStdIn() {
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    in.nextLine();
    int[][] input = new int[m][n];
    for (int i = 0; i < m; i++) {
      String line = in.nextLine();
      String[] tokens = line.split(" ");
      for (int j = 0; j < tokens.length; j++) {
        input[i][j] = Integer.parseInt(tokens[j]);
      }
    }

    in.close();
    return input;
  }

  /**
   * Checks if answer is correct and prints the appropriate message to standard
   * output
   * 
   * @param a
   *          is the 2D array constructed by the program
   * @param solutionFilePath
   *          is the path to the solution file
   */
  public static void checkAnswer(int[][] a, String solutionFilePath) {
    int[][] b = read2DArrayFromFile(solutionFilePath);
    if (a.length == 0 && b.length == 0) {
      System.out.println("✓");
    } else if (are2DArraysEqual(a, b)) {
      System.out.println("✓");
    } else {
      System.out.println("x");
    }
  }

  /**
   * Checks if two 2D arrays are equal
   * 
   * @param a
   * @param b
   * @return true if arrays 'a' and 'b' are equal, false otherwise
   */
  public static boolean are2DArraysEqual(int[][] a, int[][] b) {
    if (a.length != b.length) {
      return false;
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i].length != b[i].length) {
        return false;
      }
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] != b[i][j]) {
          return false;
        }
      }
    }

    return true;
  }

}
    
}