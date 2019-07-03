package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfStringContainsNameTest {
    CheckIfStringContainsName string;
    @Before
    public void setup()
    {
        string=new CheckIfStringContainsName();
    }
    @Test
    public void ifGivenInputStringContainsSpecifiedNameThenReturnTrue()
    {
        String result=string.returnTrueIfStringContainsName("is harry there?","harry");
        assertEquals("true",result);
    }
    @Test
    public void ifGivenInputStringDoesNotContainsSpecifiedNameThenReturnFalse()
    {
        String result=string.returnTrueIfStringContainsName("is henry there?","harry");
        assertEquals("false",result);
    }
    @Test
    public void checkIfWeAreGettingTrueForNameWhichIsInGivenString()
    {
        String result=string.returnTrueIfStringContainsName("is henry there?","harry");
        assertNotEquals("true",result);
    }
    @After
    public void tearDown()
    {
        string=null;
    }


}