package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatistecsServiceTest {
    Radio cond = new Radio();

    @Test
    void currentNumber() {
        cond.setCurrentNumber(5);
        int actual = cond.getCurrentNumber();
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void currentNumberNo() {
        cond.setCurrentNumber(-5);
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void currentNumberMax() {
        Radio cond = new Radio(100);
        cond.setCurrentNumber(99);
        int actual = cond.getCurrentNumber();
        int expected = 99;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void currentNumberMax1() {
        Radio cond = new Radio(100);
        cond.setCurrentNumber(100);
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    void nextNumber() {
        cond.setCurrentNumber(5);
        cond.nextNumber();
        int actual = cond.getCurrentNumber();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextNumberMax() {
        Radio cond = new Radio(100);
        cond.setCurrentNumber(99);
        cond.nextNumber();
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextNumberMin() {
        Radio cond = new Radio(100);
        cond.setCurrentNumber(0);
        cond.nextNumber();
        int actual = cond.getCurrentNumber();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevNumberMin() {
        Radio cond = new Radio(100);
        cond.setCurrentNumber(99);
        cond.prevNumber();
        int actual = cond.getCurrentNumber();
        int expected = 98;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevNumber() {
        cond.setCurrentNumber(5);
        cond.prevNumber();
        int actual = cond.getCurrentNumber();
        int expected = 4;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevNumber0() {
        Radio cond = new Radio(100);
        cond.setCurrentNumber(0);
        cond.prevNumber();
        int actual = cond.getCurrentNumber();
        int expected = 99;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevNumberN() {
        Radio cond = new Radio(100);
        cond.setCurrentNumber(55);
        cond.prevNumber();
        int actual = cond.getCurrentNumber();
        int expected = 54;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextNumber8_9() {
        Radio cond = new Radio(100);
        cond.setCurrentNumber(99);
        cond.nextNumber();
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextNumber1_0() {
        Radio cond = new Radio(100);
        cond.setCurrentNumber(1);
        cond.prevNumber();
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolume() {
        cond.setSoundVolume(5);
        cond.increaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolumeNo() {
        cond.setSoundVolume(-5);
        int actual = cond.getSoundVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolumeMaxNo() {
        cond.setSoundVolume(105);
        int actual = cond.getSoundVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolumeMax() {
        cond.setSoundVolume(100);
        cond.increaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolume1() {
        cond.setSoundVolume(7);
        cond.increaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolumeMin() {
        cond.setSoundVolume(0);
        cond.increaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolume() {
        cond.setSoundVolume(5);
        cond.decreaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 4;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeMin() {
        cond.setSoundVolume(0);
        cond.decreaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

}
