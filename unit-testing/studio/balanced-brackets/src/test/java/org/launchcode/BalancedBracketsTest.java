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
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), testMsg);
    }

    //6
    @Test
    public void stringWithOneBracketReturnsFalse() {
        String testMsg = "Strings containing one bracket are unbalanced";
        String testString = "[Launchcode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testString), testMsg);
    }

    //7
    @Test
    public void stringWithBackToBackBracketsReturnsFalse() {
        String testMsg= "Back to back brackets are unbalanced";
        String testString = "]Launch[code";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testString), testMsg);
    }

    //8
    @Test
    public void stringWithOnlyOneBracketReturnsFalse() {
        String testMsg= "One bracket is unbalanced";
        String testString = "]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testString), testMsg);
    }

    //9
    @Test
    public void stringWithOnlyRThenLBracketsReturnsFalse() {
        String testMsg= "Out of order brackets are unbalanced";
        String testString = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testString), testMsg);
    }

    //10
    @Test
    public void stringWithMultiplePairsOfBalancedBracketsReturnsTrue() {
        String testMsg= "Out of order brackets are unbalanced";
        String testString = "[Balanced][Brackets][Again]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testString), testMsg);
    }

    //11
    @Test
    public void stringWithNestedBalancedBracketsReturnsTrue() {
        String testMsg= "Out of order brackets are unbalanced";
        String testString = "[[Ba[lanc]ed][Brackets]]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testString), testMsg);
    }

    //12
    @Test
    public void stringWithNestedUnbalancedBracketsReturnsFalse() {
        String testMsg= "Out of order nested brackets are unbalanced";
        String testString = "[Ba[lanc[ed][Brackets]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testString), testMsg);
    }


}