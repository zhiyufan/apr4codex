package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        assertEquals(4, minMoves(5,0));
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(7, minMoves(19,2));
    }

    @Test(timeout=500)
    public void test3(){
        assertEquals(4, minMoves(10,4));
    }
}