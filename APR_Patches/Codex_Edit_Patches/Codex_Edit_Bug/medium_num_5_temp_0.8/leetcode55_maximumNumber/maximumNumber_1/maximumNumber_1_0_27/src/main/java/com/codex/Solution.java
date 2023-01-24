package com.codex;

import java.util.*;

public class Solution {
public static String maximumNumber(String num, int[] change) {
int numLength = num.length();
int[] digitCount = new int[10];
int k = 0;
int changeLength = change.length;
int len = Integer.MAX_VALUE;
for (int i = 0; i < numLength; i++) {
digitCount[num.charAt(i) - '0']++;
}
for (int i = 9; i >= 0 && k < changeLength; i--) {
while (k < changeLength && change[k] == i) {
digitCount[i]--;
k++;
}
if (k < changeLength && (i - 1 == change[k] || change[k] == 9)) {
digitCount[i]--;
digitCount[i - 1]++;
k++;
}
}
for (int i = 9; i >= 0; i--) {
if (digitCount[i] > 0) {
return getNumber(digitCount, i, len);
}
}
return "";
}
private static String getNumber(int[] digitCount, int len, int pos) {
int i = 0;
int j = 9;
char[] array = new char[len];
for (i = 0; i < len; i++) {
while (digitCount[j] == 0) {
j--;
}
array[i] = (char) (j + '0');
digitCount[j]--;
}
return String.valueOf(array);
}
}