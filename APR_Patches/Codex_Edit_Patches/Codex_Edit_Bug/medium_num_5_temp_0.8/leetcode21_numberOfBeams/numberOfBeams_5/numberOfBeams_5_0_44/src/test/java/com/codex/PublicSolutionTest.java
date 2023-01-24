package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String arr[] = {"011001","000000","010100","001000"};
        assertEquals(8, numberOfBeams(arr));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"000","111","000"};
        assertEquals(0, numberOfBeams(arr));
    }

}