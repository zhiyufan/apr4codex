package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,2,3};
        assertEquals(6, numberOfWeeks(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {5,2,1};
        assertEquals(7, numberOfWeeks(arr));
    }
}