package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        int arr[] = {3, 4, 9, 1, 3, 9, 5};
        assertEquals(findKDistantIndices(arr, 9, 1), new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {2, 2, 2, 2, 2};
        assertEquals(findKDistantIndices(arr, 2, 2), new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4)));
    }

}