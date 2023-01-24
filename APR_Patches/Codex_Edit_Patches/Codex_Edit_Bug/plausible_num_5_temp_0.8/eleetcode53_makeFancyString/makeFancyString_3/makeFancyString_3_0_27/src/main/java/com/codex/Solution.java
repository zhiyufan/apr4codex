package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public String addBinary(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int i = A.length() - 1, j = B.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum = sum + (int) (A.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum = sum + (int) (B.charAt(j) - '0');
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        String result = sb.reverse().toString();
        return result;
    }
    public int compareVersion(String A, String B) {
        String[] strsA = A.split("\\.");
        String[] strsB = B.split("\\.");
        int i = 0, j = 0;
        for (; i < strsA.length && j < strsB.length; i++, j++) {
            int intA = Integer.parseInt(strsA[i]);
            int intB = Integer.parseInt(strsB[j]);
            if (intA < intB) {
                return -1;
            } else if (intA > intB) {
                return 1;
            } else {
                continue;
            }
        }
        if (i >= strsA.length && j >= strsB.length) {
            return 0;
        } else if (i < strsA.length) {
            for (int k = i; k < strsA.length; k++) {
                if (strsA[k].equals("0")) {
                    continue;
                } else {
                    return 1;
                }
            }
            return 0;
        } else {
            for (int k = j; k < strsB.length; k++) {
                if (strsB[k].equals("0")) {
                    continue;
                } else {
                    return -1;
                }
            }
            return 0;
        }
    }

    public int reverse(int A) {
        try {
            int sign = 1;
            if (A < 0) {
                sign = -1;
            }
            if (A == Integer.MIN_VALUE) {
                return 0;
            }
            A = Math.abs(A);
            int result = 0;
            while (A > 0) {
                int last = A % 10;
                A = A / 10;
                result = result * 10 + last;
            }
            if (result == 0) {
                return 0;
            }
            return result * sign;
        } catch (Exception e) {
            return 0;
        }
    }
    public int strStr(final String A, final String B) {
        int a = A.length();
        int b = B.length();
        if (a == 0 || b == 0) {
            return -1;
        }
        for (int i = 0; i <= (a - b); i++) {
            int j = 0;
            for (; j < b; j++) {
                if (A.charAt(i + j) != B.charAt(j)) {
                    break;
                }
            }
            if (j == b) {
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }
    public int titleToNumber(String A) {
        int result = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
            int charInt = A.charAt(i) - 'A' + 1;
            result = result + (int) (charInt * Math.pow(26, A.length() - 1 - i));
        }
        return result;
    }
    public int lengthOfLastWord(final String A) {
        String[] strs = A.split(" ");
        if (strs.length == 0) {
            return 0;
        } else {
            return strs[strs.length - 1].length();
        }
    }
    public boolean isPalindrome(String A) {
        if (A == null || A.length() == 0) {
            return true;
        }
        int left = 0;
        int right = A.length() - 1;
        while (left <= right) {
            while (left < A.length() && !isAlphaNumberic(A.charAt(left))) {
                left++;
            }
            while (right >= 0 && !isAlphaNumberic(A.charAt(right))) {
                right--;
            }
            if (left <= right) {
                if (Character.toUpperCase(A.charAt(left)) != Character.toUpperCase(A.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    private boolean isAlphaNumberic(char c) {
        if (Character.isLetter(c) || Character.isDigit(c)) {
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Integer> findSubstring(String A, final List<String> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int len = B.get(0).length();
        int num = B.size();
        ArrayList<String> strs = new ArrayList<String>(B);
        for (int i = 0; i <= A.length() - len * num; i++) {
            if (isValid(i, A, strs, len)) {
                result.add(i);
            }
        }
        return result;
    }
    private boolean isValid(int start, String A, ArrayList<String> strs, int len) {
        ArrayList<String> aStrs = new ArrayList<String>();
        int i = start;
        while (i < start + len * strs.size()) {
            String thisStr = A.substring(i, i + len);
            aStrs.add(thisStr);
            i = i + len;
        }
        //aStrs.removeAll(strs);
        for (String thisStr : strs) {
            aStrs.remove(thisStr);
        }
        if (aStrs.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
}