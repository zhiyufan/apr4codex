package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums2[j] = 0;
                        break;
                    }
                }
            }
            for (int j = 0; j < nums3.length; j++) {
                if (nums1[i] == nums3[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums2[i] == nums3[j]) {
                    if (nums2[i] == 0) {
                        continue;
                    } else {
                        result.add(nums2[i]);
                        nums2[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        return result;
    }

    
    public static double f(double x) {
        double t = - 0.2 * Math.pow(x, 4) - 0.9 * Math.pow(x, 3) - 2.4 * Math.pow(x, 2) + 4.3 * x + 2.3;
        return t;
    }

    public static double g(double x) {
        double t = - 0.25 * Math.pow(x, 4) - 1.25 * Math.pow(x, 3) - 3.2 * Math.pow(x, 2) + 5.3 * x + 2.3;
        return t;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static List<Integer> findProperCoefficients(int[] array) {
        List<Integer> result = new ArrayList<>();
        int maxItem = Program.max(array);
        int minItem = Program.min(array);
        int sum = 0;
        int gcd = Program.gcd(maxItem, minItem);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % gcd == 0) {
            result.add(sum / gcd);
            result.add(gcd / gcd);
        } else {
            result.add(sum / minItem);
            result.add(minItem / minItem);
        }
        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums3 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> result = twoOutOfThree(nums1, nums2, nums3);
        result.stream().mapToInt(e -> e).forEach(e -> System.out.print(e + " "));
        System.out.println();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(f(x) + " " + g(y) + " " + max(nums3));
        List<Integer> coefficients = findProperCoefficients(nums1);
        System.out.println(coefficients.get(0) + " " + coefficients.get(1));
    }
    
}