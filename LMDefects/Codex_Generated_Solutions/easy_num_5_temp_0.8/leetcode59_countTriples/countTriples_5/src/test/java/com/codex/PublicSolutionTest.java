package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        assertEquals(2, countTriples(5));
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(4, countTriples(10));
    }
}