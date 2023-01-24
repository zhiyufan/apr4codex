package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
    
    int flips = 0;
    int M = start ^ goal;
    int left = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        left++;
        M >>= 1;
    }
    return flips + left - 1;
}

public static int minBitFlips(int start, int goal) {

    if (start == goal) {
        return 0;
    }
	int M = start ^ goal;
    int flips = 0;
    int left = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        left++;
        M >>= 1;
    }
    return flips + left - 1;
}

public static int minBitFlips(int start, int goal) {

    if (start == goal) {
        return 0;
    }
    int M = start ^ goal;
    int flips = 0;
    int left = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        left++;
        M >>= 1;
    }
    return flips + left - 1;
}

public static int minBitFlips(int start, int goal) {
    if (start == goal) {
        return 0;
    }

    int M = start ^ goal;
    int left = 0;
    int flips = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        M >>= 1;
        left++;
    }
    if ((start & 1) == 1) {
        left--;
    }
    return flips + left;
}

public static int minBitFlips(int start, int goal) {

    if (start == goal) {
        return 0;
    }
    int M = start ^ goal;
    int left = 0;
    int flips = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        M >>= 1;
        left++;
    }
    if ((start & 1) == 1) {
        left--;
    }
    return flips + left;
}



public static int minBitFlips(int start, int goal) {
    if (start == goal) {
        return 0;
    }
    int M = start ^ goal;
    int left = 0;
    int flips = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        M >>= 1;
        left++;
    }
    if ((start & 1) == 1) {
        left--;
    }
    return flips + left;
}


public static int minBitFlips(int start, int goal) {
    if (start == goal) {
        return 0;
    }
    int M = start ^ goal;
    int left = 0;
    int flips = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        M >>= 1;
        left++;
    }
    if ((start & 1) == 1) {
        left--;
    }
    return flips + left;
}


public static int minBitFlips(int start, int goal) {
    if (start == goal) {
        return 0;
    }
    int M = start ^ goal;
    int left = 0;
    int flips = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        M >>= 1;
        left++;
    }
    if ((start & 1) == 1) {
        left--;
    }
    return flips + left;
}


    public static int minBitFlips(int start, int goal) {
        if (start == goal) {
            return 0;
        }
        int M = start ^ goal;
        int left = 0;
        int flips = 0;
        while (M > 0) {
            if ((M & 1) == 1) {
                flips++;
            }
            left++;
            M >>= 1;
        }
        if ((start & 1) == 1) {
            left--;
        }
        return flips + left;
    }



public static int minBitFlips(int start, int goal) {
    if (start == goal) {
        return 0;
    }
    int M = start ^ goal;
    int left = 0;
    int flips = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        M >>= 1;
        left++;
    }
    if ((start & 1) == 1) {
        left--;
    }
    return flips + left;
}


public static int minBitFlips(int start, int goal) {
    if (start == goal) {
        return 0;
    }
    int M = start ^ goal;
    int left = 0;
    int flips = 0;
    while (M > 0) {
        if ((M & 1) == 1) {
            flips++;
        }
        M >>= 1;
        left++;
    }
    if ((start & 1) == 1) {
        left--;
    }
    return flips + left;
}
}