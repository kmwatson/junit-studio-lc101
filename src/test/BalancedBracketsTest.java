package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    /*@Test
    public void emptyTest() {
        assertEquals(true, true);
    } */

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void openBracketTextCloseBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void textOpenBracketTextCloseBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets( "Launch[Code]"));
    }

   @Test
   public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
   }

   @Test
   public void openBracketCloseBracketText(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
   }

    @Test
    public void reverseOrderBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void openBracketFollowedByTextNoClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void textCloseBracketTextOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void deepNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][][[]]]"));
    }

    @Test
    public void textClosingBracketNoOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }

    @Test
    public void multipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }
}
