package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public static int numberOfBeams(String[] bank) {
    List<String> list = Arrays.asList(bank);
    return checkBeam(list, 0, new ArrayList<>());
  }

  private static int checkBeam(List<String> bank, int rowIndex, List<String> list) {
    if (rowIndex > bank.size() - 1) {
      if (isValid(list)) {
        return 1;
      } else {
        return 0;
      }
    }

    int count = 0;
    for (int i = 0; i < bank.size(); ++i) {
      if (i != rowIndex) {
        list.add(bank.get(i));
        count += checkBeam(bank, i + 1, list);
        list.remove(bank.get(i));
      } else {
        count += checkBeam(bank, i + 1, list);
        }
    }

    return count;
  }

  private static boolean isValid(List<String> list) {
    if (list.size() != 3) {
      return false;
    }

    for (int i = 0; i < list.get(0).length(); ++i) {
      if (list.get(0).charAt(i) == '1' && list.get(1).charAt(i) == '1' && list.get(2).charAt(i) == '1') {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String[] bank = new String[] {"1000", "1110", "1111"};
    System.out.println(numberOfBeams(bank));
  }
}
}