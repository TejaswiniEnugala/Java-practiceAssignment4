package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacementOfCharactersTest {
    ReplacementOfCharacters replacementOfCharacter;
    @Before
    public void setUp(){
        replacementOfCharacter=new ReplacementOfCharacters(); //creating an object
    }
    @Test
    public void givenAStringReturnsStringWithReplacedCharacters(){
        String res=replacementOfCharacter.replacementOfACharacter("dry sun");
        assertEquals("fry sun",res);
    }
    @Test
    public void givenAnEmptyStringReturnsNull(){
        String res=replacementOfCharacter.replacementOfACharacter(" ");
        assertEquals("null",res);
    }
    @Test
    public void givenAStringReturnsOriginalString(){
        String res=replacementOfCharacter.replacementOfACharacter("Phonecall");
        assertEquals("Phonecatt",res);
    }
    @After
    public void tearDown(){
        replacementOfCharacter=null;
    }

}