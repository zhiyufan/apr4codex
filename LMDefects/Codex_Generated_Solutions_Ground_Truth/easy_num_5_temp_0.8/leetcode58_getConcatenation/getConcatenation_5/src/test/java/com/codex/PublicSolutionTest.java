package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,2,1};
        int arr2[] = {1,2,1,1,2,1};
        assertArrayEquals(arr2, getConcatenation(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,3,2,1};
        int arr2[] = {1,3,2,1,1,3,2,1};
        assertArrayEquals(arr2, getConcatenation(arr));
    }
}