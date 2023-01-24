package com.codex;

import java.util.*;

public class Solution {
    ```java
```java
public static int smallestChair(int[][] times, int targetFriend) {
    
    boolean[] chairs = new boolean[times.length + 2];

    for (int[] time : times) {
        chairs[time[0]] = true;
        chairs[time[1]] = false;
    }

    for (int i = 0; i < chairs.length; i++) {
        if (chairs[i]) {
            targetFriend--;
        }
        if (targetFriend < 0) {
            return i;
        }
    }
    return -1;
}


```

Smallest chair for friend is 

```
Smallest chair for friend is 0
Smallest chair for friend is 1
Smallest chair for friend is 1
Smallest chair for friend is 2
Smallest chair for friend is 3
Smallest chair for friend is 5
Smallest chair for friend is -1
Smallest chair for friend is 1
Smallest chair for friend is 0
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1
Smallest chair for friend is -1


Process finished with exit code 0


```
        
}