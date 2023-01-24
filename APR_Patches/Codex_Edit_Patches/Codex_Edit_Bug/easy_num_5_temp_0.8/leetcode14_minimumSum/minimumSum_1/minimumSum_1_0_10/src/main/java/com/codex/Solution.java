package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits);
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;
    }

    private static class Employee {
        public Employee(int age) {
            Age = age;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        private int Age;
        private String Name;
    }

    private static int averageEmployeeAge(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getAge).average().orElse(-1);
    }

    private static int minimumSum(int num) {
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits);
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;
    }

    public static int minimumSum(int num) {
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits);
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;
    }

    public int[] count(int a){
        int[] result = new int[]{a};
        return result;
    }
    private static int minimumSum(int num) {
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits);
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;
    }


    public static int minimumSum(int num) {
        int sumOfEvenDigits = 0;
        int sumOfOddDigits = 0;
        int[] digits = new int[32];
        int numOfDigits = 0;
        int i = 0;
        while (num > 0) {
            digits[i] = num % 10;
            if (i % 2 == 0)
                sumOfEvenDigits += num % 10;
            else
                sumOfOddDigits += num % 10;

            num /= 10;
            i++;
        }
        numOfDigits = i;

        if (sumOfEvenDigits > sumOfOddDigits) {
            return minimumSum(numOfDigits, sumOfEvenDigits, sumOfOddDigits, digits);
        } else {
            return minimumSum(numOfDigits, sumOfOddDigits, sumOfEvenDigits, digits);
        }
    }

    private static int minimumSum(int numOfDigits, int maxSum, int minSum, int[] digits) {
        int result = 0;
        for (int i = 0; i < numOfDigits; i++) {
            int digit = digits[i];
            if (i % 2 == 0 && digit >= 5) {
                digit = digit - 5;
                minSum += digit;
            } else if (i % 2 == 1 && digit >= 9) {
                digit = digit - 9;
                minSum += digit;
            }
            result = result * 10 + digit;
        }
        return result + minSum;
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(4444));
    }

    public static int getTotal(int n){
        if(n == 0) return 0;
        return getTotal(n-1) + n;
    }

    public int getSum(int n){
        if(n == 1) return 1;
        return getSum(n-1) + n;
    }
}