package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[1], col2 = artifact[3];
            int row1 = artifact[0], row2 = artifact[2];
            boolean rowCovered = false, colCovered = false;
            for (int j = 0; j < digRow.length; j++) {
                if (digRow[j] >= row1 && digRow[j] <= row2) {
                    rowCovered = true;
                }
                if (digCol[j] >= col1 && digCol[j] <= col2) {
                    colCovered = true;
                }
            }
            if (!rowCovered || !colCovered) {
                totalArtifacts--;
            }
        }
        return totalArtifacts;
    }

    
}