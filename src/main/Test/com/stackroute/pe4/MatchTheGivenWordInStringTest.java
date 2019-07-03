package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchTheGivenWordInStringTest {
    MatchTheGivenWordInString matchword;
    @Before
    public void setup()
    {
        matchword=new MatchTheGivenWordInString();
    }
    @Test
    public void checkTheWordOccurenceInTheGivenString()
    {
        String result=matchword.matchTheGivenWordInTheInputString("She sells seashells by the seashore","se");
        assertEquals("found: 1 : 4 - 6\n" +
                "found: 2 : 10 - 12\n" +
                "found: 3 : 27 - 29\n",result);
    }
    @Test
    public void checkTheWordOccurenceInTheGivenInputString()
    {
        String result=matchword.matchTheGivenWordInTheInputString("She sells seashells by the seashore","sh");
        assertNotEquals("found: 1 : 4 - 6\n" +
                "found: 2 : 10 - 12\n" +
                "found: 3 : 27 - 29\n",result);
    }
    @Test
    public void checkTheOutputIfGivenWordIsNotInTheString()
    {
        String result=matchword.matchTheGivenWordInTheInputString("She sells seashells by the seashore","nm");
        assertEquals("",result);
    }
    @After
    public void tearDown()
    {
        matchword=null;
    }

}