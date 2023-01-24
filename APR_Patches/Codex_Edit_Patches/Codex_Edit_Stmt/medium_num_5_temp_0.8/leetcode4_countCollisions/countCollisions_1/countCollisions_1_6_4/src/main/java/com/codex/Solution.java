package com.codex;

import java.util.*;

public class Solution {
@Override
public void save(String filename) {
    if (filename == null) {
        throw new IllegalArgumentException("Filename cannot be null.");
    }
    writeIn(filename);
}
}