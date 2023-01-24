package com.codex;

import java.util.*;

public class Solution {
rng[i] = Math.max(rows[i], cols[i]) is wrong. The correct is
rng[i] = Math.max(rows[i], cols[i]) - Math.min(rows[i], cols[i]);
}