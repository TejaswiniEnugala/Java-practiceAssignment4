package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseOfStringInStatementTest {
    ReverseOfStringInStatement reverseOfStringsInAStatement;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        reverseOfStringsInAStatement = new ReverseOfStringInStatement();
    }

    @Test
    public void givenStringMustReturnReverseOfStringsInTheStatement()
    {
        actualresult=reverseOfStringsInAStatement.reverseOfStringsOfStatement("I am happy");
        expectedresult = "I ma yppah";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void givenStatementMustReturnReverseOfStringsOfTheStatement()
    {
        actualresult=reverseOfStringsInAStatement.reverseOfStringsOfStatement("a quick brown fox jumps over the lazy dog");
        expectedresult = "a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void givenStatementMustReturnReversedStringsOfTheStatement()
    {
        actualresult=reverseOfStringsInAStatement.reverseOfStringsOfStatement("");
        expectedresult = null;
        assertEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        reverseOfStringsInAStatement = null;
    }

}