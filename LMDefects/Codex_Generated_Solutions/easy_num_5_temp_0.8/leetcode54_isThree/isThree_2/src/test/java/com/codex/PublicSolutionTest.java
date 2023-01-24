package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        assertFalse(isThree(2));
    }

    @Test(timeout=500)
    public void test2(){
        assertTrue(isThree(4));
    }
}