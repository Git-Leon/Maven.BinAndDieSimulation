package com.github.git_leon.dicerollsimulator.dicetest;

import com.github.git_leon.dicerollsimulator.Dice;
import org.junit.Assert;
import org.junit.Test;

public class GetRollMaxTest {
    @Test(expected = IndexOutOfBoundsException.class)
    public void test1() {
        // given
        Integer numberOfFaces = 1;
        Integer numberOfDie = 0;
        Integer expected = numberOfDie * numberOfFaces;

        // when
        Dice dice = new Dice(numberOfDie, numberOfFaces);

        // then
        Integer actual = dice.getRollMax();
        Assert.assertEquals(expected, actual);
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void test2() {
        // given
        Integer numberOfFaces = 2;
        Integer numberOfDie = 0;
        Integer expected = numberOfDie * numberOfFaces;

        // when
        Dice dice = new Dice(numberOfDie, numberOfFaces);

        // then
        Integer actual = dice.getRollMax();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Integer numberOfFaces = 1;
        Integer numberOfDie = 1;
        Integer expected = numberOfDie * numberOfFaces;

        // when
        Dice dice = new Dice(numberOfDie, numberOfFaces);

        // then
        Integer actual = dice.getRollMax();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        Integer numberOfFaces = 1;
        Integer numberOfDie = 2;
        Integer expected = numberOfDie * numberOfFaces;

        // when
        Dice dice = new Dice(numberOfDie, numberOfFaces);

        // then
        Integer actual = dice.getRollMax();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test5() {
        // given
        Integer numberOfFaces = 2;
        Integer numberOfDie = 1;
        Integer expected = numberOfDie * numberOfFaces;

        // when
        Dice dice = new Dice(numberOfDie, numberOfFaces);

        // then
        Integer actual = dice.getRollMax();
        Assert.assertEquals(expected, actual);
    }
}
