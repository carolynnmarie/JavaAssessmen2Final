package com.zipcodewilmington.assessment2.part7;

import org.junit.Assert;
import org.junit.Test;

public class FindTheWinnerTest {

    Integer[] leon = {1,2,3};
    Integer[] wilhelm = {2,1,3};
    FindTheWinner findTheWinner = new FindTheWinner();

    @Test
    public void winnerTest1(){
        String input = "Even";
        String expected = "Wilhelm";
        String actual = findTheWinner.winner(leon, wilhelm, input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void winnerTest2(){
        String input = "Odd";
        String expected = "Leon";
        String actual = findTheWinner.winner(leon, wilhelm, input);
        Assert.assertEquals(expected, actual);
    }

}
