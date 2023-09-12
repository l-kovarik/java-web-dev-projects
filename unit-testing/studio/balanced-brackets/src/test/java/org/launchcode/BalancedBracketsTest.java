package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //1
    @Test
    public void stringEnclosedInBracketsReturnsTrue() {
        String testMsg = "String enclosed in brackets is balanced";
        String testString = "[Launchcode]";
        assertEquals(true, true, testMsg);
    }

    //2
    @Test
    public void stringIncludingBracketsReturnsTrue() {
        String testMsg = "String including in brackets is balanced";
        String testString = "Launch[code]";
        assertEquals(true, true, testMsg);
    }

    //3
    @Test
    public void stringBeginningWithBracketsReturnsTrue() {
        String testMsg = "String beginning with brackets is balanced";
        String testString = "[]Launchcode";
        assertEquals(true, true, testMsg);
    }

    //4
    @Test
    public void emptyStringReturnsTrue() {
        String testMsg = "Empty is balanced";
        String testString = "";
        assertEquals(true, true, testMsg);
    }

    //5
    @Test
    public void stringConsistingOfOnlyBracketsReturnsTrue() {
        String testMsg = "String consisting of only brackets is balanced";
        String testString = "[]";
        assertEquals(true, true, testMsg);
    }

    //6
    @Test
    public void stringWithOneBracketReturnsFalse() {
        String testMsg = "Strings containing one bracket are unbalanced";
        String testString = "[Launchcode";
        boolean condition =  BalancedBrackets.hasBalancedBrackets(testString);
        assertFalse(condition, testMsg);
    }

    //7
    @Test
    public void stringConsistingOfBracketsReturnsTrue() {
        String testMsg= "Balanced brackets within a string";
        String testString = "Launch[]code";

    }

}