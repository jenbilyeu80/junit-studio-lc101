package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    // @Test public void emptyTest() {
    void assertEquals() {

    }


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void TwoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] []"));
    }

    @Test
    public void BracketsWithinReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void twoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]] []"));
    }

    @Test
    public void oneBracketWithinReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }



    @Test
    public void twoGroupBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[] []]]"));

    }
}

