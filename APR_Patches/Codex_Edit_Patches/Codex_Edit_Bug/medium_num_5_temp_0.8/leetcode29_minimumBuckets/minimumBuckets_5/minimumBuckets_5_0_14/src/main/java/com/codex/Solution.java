package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int count = 0;
        for (int i = 0; i < street.length(); i++) {
            if (i == 0) {
                if (street.charAt(i) == 'H') {
                    count++;
                }
            }
            else if (street.charAt(i) == 'H' && street.charAt(i - 1) != 'H') {
                count++;
            }
        }
        return count;
    }
public class Hasher {

    // Return a string formed by concatenating zeroes to the right
    // of input string S until its length is a multiple of 4.
    // Assumes S contains only the characters 0 and 1.

    public static String padZeroes(String s) {
        if (s.length() % 4 != 0) {
            int numZeroesToAdd = 4 - s.length() % 4;
            for (int i = 0; i < numZeroesToAdd; i++) {
                s = s + '0';
            }
        }
        return s;
    }

    // Return a string that is the input string, S, with all
    // lower-case letters converted to upper-case.

    public static String toUpperCase(String s) {
        String upper = "";
        
        for (int i = 0; i < s.length(); i++) {
            char currchar = s.charAt(i);
            if (Character.isUpperCase(currchar)) {
                upper += Character.toUpperCase(currchar);
            }
            else {
                upper += currchar;
            }
        }
        return upper;
    }

    // Return the hexadecimal representation of the binary string S.
    // Assumes S is a binary string.

    public static String binaryToHex(String s) {
        s = padZeroes(s);
        String result = "";
        int numOctets = s.length() / 4;

        for (int i = 0; i < numOctets; i++) {
            String currOctet = s.substring(i * 4, i * 4 + 4);
            switch (currOctet) {
            case "0000": result += "0";
                break;
            case "0001": result += "1";
                break;
            case "0010": result += "2";
                break;
            case "0011": result += "3";
                break;
            case "0100": result += "4";
                break;
            case "0101": result += "5";
                break;
            case "0110": result += "6";
                break;
            case "0111": result += "7";
                break;
            case "1000": result += "8";
                break;
            case "1001": result += "9";
                break;
            case "1010": result += "A";
                break;
            case "1011": result += "B";
                break;
            case "1100": result += "C";
                break;
            case "1101": result += "D";
                break;
            case "1110": result += "E";
                break;
            case "1111": result += "F";
                break;
            }
        }
        return result;
    }

    // Return the binary representation of hex string S.
    // Assumes S is a hex string.

    public static String hexToBinary(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char currchar = s.charAt(i);
            switch (currchar) {
            case '0': result += "0000";
                break;
            case '1': result += "0001";
                break;
            case '2': result += "0010";
                break;
            case '3': result += "0011";
                break;
            case '4': result += "0100";
                break;
            case '5': result += "0101";
                break;
            case '6': result += "0110";
                break;
            case '7': result += "0111";
                break;
            case '8': result += "1000";
                break;
            case '9': result += "1001";
                break;
            case 'A': result += "1010";
                break;
            case 'B': result += "1011";
                break;
            case 'C': result += "1100";
                break;
            case 'D': result += "1101";
                break;
            case 'E': result += "1110";
                break;
            case 'F': result += "1111";
                break;
            default: throw new IllegalArgumentException("Must be a hex string only");
            }
        }
        return result;
    }

    // Return the number of bits needed to represent the integer
    // Assumes that x is a non-negative number.

    public static int bitsNeeded(int x) {
        int count = 0;
        while (x > 0) {
            x = x / 2;
            count++;
        }
        return count;
    }

    // Return the binary representation of the integer X as a string.
    // First, calculate how many bits you'll need to store X, and
    // then go through the bit by bit, starting at the high end and
    // going to the low end, to generate the binary representation.

    public static String decimalToBinary(int x) {
        String result = "";
        int bits = bitsNeeded(x);

        for (int i = bits - 1; i >= 0; i--) {
            if (Math.pow(2, i) <= x) {
                result += "1";
                x -= Math.pow(2, i);
            }
            else {
                result += "0";
            }
        }
        return result;
    }

    // Return a version of the given string, where each character
    // is replaced by a % followed by its hexadecimal value.

    public static String urlEncode(String s) {
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            char currchar = s.charAt(i);
            result += "%" + decimalToHex(currchar);
        }
        
        return result;
    }

    // Return the integer value represented by the binary string S.

    public static int binaryToDecimal(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += Integer.parseInt(s.substring(i, i + 1)) * Math.pow(2, s.length() - i - 1);
        }
        return result;
    }

    public static String hashIt(String s) {
       
        // Convert String to all upper-case, then pad it with zeroes
        // until it's length is a multiple of 4, then convert it to a
        // binary string.

        String u = toUpperCase(s);
        String v = padZeroes(u);

        int numOctets = v.length() / 4;
        int[] values = new int[numOctets];

        for (int i = 0; i < numOctets; i++) {
            values[i] = binaryToDecimal(v.substring(i * 4, (i + 1) * 4));
        }

        int hashCode = 0;
        for (int i = 0; i < numOctets; i++) {
            hashCode = 31 * hashCode + values[i];
        }
        return binaryToHex(decimalToBinary(hashCode));
    }

    public static void main(String[] args) {
        System.out.println(hashIt("Hello"));
    }
}


    
}