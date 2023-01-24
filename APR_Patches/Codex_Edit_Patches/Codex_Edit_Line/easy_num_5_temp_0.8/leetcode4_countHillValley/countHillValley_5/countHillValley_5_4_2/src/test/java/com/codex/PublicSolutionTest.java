package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        int arr[] = {2, 4, 1, 1, 6, 5};
        assertEquals(countHillValley(arr), 3);
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {6, 6, 5, 5, 4, 1};
        assertEquals(countHillValley(arr), 0);
    }

}