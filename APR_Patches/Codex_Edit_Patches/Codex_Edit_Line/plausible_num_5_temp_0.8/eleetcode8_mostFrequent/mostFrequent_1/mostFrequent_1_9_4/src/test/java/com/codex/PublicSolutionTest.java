package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        int arr[] = {1, 100, 200, 1, 100};
        assertEquals(mostFrequent(arr, 1), 100);
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {2, 2, 2, 2, 3};
        assertEquals(mostFrequent(arr, 2), 2);
    }

}