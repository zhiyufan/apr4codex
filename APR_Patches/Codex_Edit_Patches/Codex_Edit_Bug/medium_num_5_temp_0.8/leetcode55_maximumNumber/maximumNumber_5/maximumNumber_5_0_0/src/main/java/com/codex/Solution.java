package com.codex;

import java.util.*;

public class Solution {
    public static int[] findNumber(int[] arr, int k) {
        int l = 0, h = arr.length - 1;
        int m = -1;
        while (l <= h) {
            m = l + (h - l) / 2;
            if (arr[m] == k) {
                return new int[] { m, m };
            } else if (arr[l] > k) {
                h = m - 1;
            } else if (arr[h] < k) {
                l = m + 1;
            } else if (arr[m] < k) {
                l = m + 1;
            } else if (arr[m] > k) {
                h = m - 1;
            }
        }

        if (arr[m] < k) {
            while (arr[m] > k) {
                m++;
            }
        } else {
            while (arr[m] < k) {
                m--;
            }
        }

        int lPos = m, hPos = m;
        while (lPos > 0 && arr[lPos - 1] == k) {
            lPos--;
        }

        while (hPos < arr.length - 1 && arr[hPos + 1] == k) {
            hPos++;
        }
        if (arr[lPos] == k && arr[hPos] == k) {
            return new int[] { lPos, hPos };
        }

        return new int[] { -1, -1 };
    }

    
                    }
                }

                cnt[i]++;
                res = temp.append(i).length() > res.length() ? temp.append(i) : res;
            }
        }

        return res.toString();
    }

    
}