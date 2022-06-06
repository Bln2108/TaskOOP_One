package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatistecsServiceTest {

    @Test
    void currentNumber() {
        Radio cond = new Radio();
        cond.setCurrentNumber(5);
        int actual = cond.getCurrentNumber();
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void currentNumberNo() {
        Radio cond = new Radio();
        cond.setCurrentNumber(-5);
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void currentNumberMax() {
        Radio cond = new Radio();
        cond.setCurrentNumber(10);
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void currentNumberMin() {
        Radio cond = new Radio();
        cond.setCurrentNumber(0);
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextNumber() {
        Radio cond = new Radio();
        cond.setCurrentNumber(5);
        cond.nextNumber();
        int actual = cond.getCurrentNumber();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextNumberMax() {
        Radio cond = new Radio();
        cond.setCurrentNumber(9);
        cond.nextNumber();
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextNumberMin() {
        Radio cond = new Radio();
        cond.setCurrentNumber(0);
        cond.nextNumber();
        int actual = cond.getCurrentNumber();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevNumberMin() {
        Radio cond = new Radio();
        cond.setCurrentNumber(0);
        cond.prevNumber();
        int actual = cond.getCurrentNumber();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevNumber() {
        Radio cond = new Radio();
        cond.setCurrentNumber(5);
        cond.prevNumber();
        int actual = cond.getCurrentNumber();
        int expected = 4;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolume() {
        Radio cond = new Radio();
        cond.setSoundVolume(5);
        cond.increaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolumeNo() {
        Radio cond = new Radio();
        cond.setSoundVolume(-5);
        int actual = cond.getSoundVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolumeMaxNo() {
        Radio cond = new Radio();
        cond.setSoundVolume(15);
        int actual = cond.getSoundVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolumeMax() {
        Radio cond = new Radio();
        cond.setSoundVolume(10);
        cond.increaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 10;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolume1() {
        Radio cond = new Radio();
        cond.setSoundVolume(7);
        cond.increaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void soundVolumeMin() {
        Radio cond = new Radio();
        cond.setSoundVolume(0);
        cond.increaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolume() {
        Radio cond = new Radio();
        cond.setSoundVolume(5);
        cond.decreaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 4;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeMin() {
        Radio cond = new Radio();
        cond.setSoundVolume(0);
        cond.decreaseVolume();
        int actual = cond.getSoundVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextNumber8_9() {
        Radio cond = new Radio();
        cond.setCurrentNumber(8);
        cond.nextNumber();
        int actual = cond.getCurrentNumber();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextNumber1_0() {
        Radio cond = new Radio();
        cond.setCurrentNumber(1);
        cond.prevNumber();
        int actual = cond.getCurrentNumber();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}
