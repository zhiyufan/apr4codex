package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[][] = {
            {4,8}, {3,6},
            {10,20}, {15,30}
        };
        assertEquals(6, interchangeableRectangles(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[][] = {
            {4,5}, {7,8}
        };
        assertEquals(0, interchangeableRectangles(arr));
    }

}