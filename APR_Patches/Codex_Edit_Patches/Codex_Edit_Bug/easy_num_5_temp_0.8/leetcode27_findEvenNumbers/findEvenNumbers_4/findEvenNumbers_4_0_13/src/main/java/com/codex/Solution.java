package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        Set<Integer> oddNumbers = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 100; i <= 999; i++) {
            String[] values = String.valueOf(i).split("");
            if (!(oddNumbers.contains(Integer.parseInt(values[0])) &&
                    oddNumbers.contains(Integer.parseInt(values[1])) &&
                    oddNumbers.contains(Integer.parseInt(values[2])))) {
                result.add(i);
            }

        }
        return result.stream().mapToInt(i->i).toArray();
    }


    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        for (int i = 100; i <= 999; i++) {
            String[] values = String.valueOf(i).split("");
            if (!(values[0].equals("1") && values[1].equals("3") && values[2].equals("5"))) {
                result.add(i);
            }
            if (!(values[0].equals("1") && values[1].equals("5") && values[2].equals("7"))) {
                result.add(i);
            }
            if (!(values[0].equals("1") && values[1].equals("7") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("3") && values[1].equals("5") && values[2].equals("7"))) {
                result.add(i);
            }
            if (!(values[0].equals("3") && values[1].equals("7") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("5") && values[1].equals("7") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("3") && values[1].equals("1") && values[2].equals("7"))) {
                result.add(i);
            }
            if (!(values[0].equals("5") && values[1].equals("1") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("7") && values[1].equals("3") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("7") && values[1].equals("3") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("9") && values[1].equals("1") && values[2].equals("5"))) {
                result.add(i);
            }
            if (!(values[0].equals("9") && values[1].equals("3") && values[2].equals("5"))) {
                result.add(i);
            }
            if (!(values[0].equals("9") && values[1].equals("5") && values[2].equals("7"))) {
                result.add(i);
            }
            if (!(values[0].equals("7") && values[1].equals("5") && values[2].equals("1"))) {
                result.add(i);
            }
            if (!(values[0].equals("5") && values[1].equals("3") && values[2].equals("1"))) {
                result.add(i);
            }
            if (!(values[0].equals("3") && values[1].equals("1") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("1") && values[1].equals("9") && values[2].equals("7"))) {
                result.add(i);
            }
            if (!(values[0].equals("1") && values[1].equals("3") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("1") && values[1].equals("3") && values[2].equals("5"))) {
                result.add(i);
            }
            if (!(values[0].equals("1") && values[1].equals("5") && values[2].equals("7"))) {
                result.add(i);
            }
            if (!(values[0].equals("1") && values[1].equals("7") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("3") && values[1].equals("5") && values[2].equals("7"))) {
                result.add(i);
            }
            if (!(values[0].equals("3") && values[1].equals("7") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("5") && values[1].equals("7") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("3") && values[1].equals("1") && values[2].equals("7"))) {
                result.add(i);
            }
            if (!(values[0].equals("5") && values[1].equals("1") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("7") && values[1].equals("3") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("7") && values[1].equals("3") && values[2].equals("9"))) {
                result.add(i);
            }
            if (!(values[0].equals("9") && values[1].equals("1") && values[2].equals("5"))) {
                result.add(i);
            }
            if (!(values[0].equals("9") && values[1].equals("3") && values[2].equals("5"))) {
                result.add(i);
            }
            if (!(values[0].equals("9") && values[1].equals("5") && values[2].equals("7"))) {
                result.add(i);
            }
        }
        System.out.println("result = " + result);
    }


    public static String formatCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String dateString = sdf.format(date);
       
                }
            }
        }
        int[] result = evenNumbers.stream().mapToInt(i->i).toArray();
        Arrays.sort(result);
        return result;
    }

    
}