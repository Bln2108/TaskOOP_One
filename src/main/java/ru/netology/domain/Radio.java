package ru.netology.domain;

public class Radio {

    private int currentNumber;
    private int soundVolume;

    public void setCurrentNumber(int newcurrentNumber) {
        if (newcurrentNumber > 9) {
            return;
        }
        if (newcurrentNumber < 0) {
            return;
        }
        this.currentNumber = newcurrentNumber;
    }

    public void nextNumber() {
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        }
        if (currentNumber == 9) {
            currentNumber = 0;
        }
    }

    public void prevNumber() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        }
        if (currentNumber == 0) {
            currentNumber = 9;
        }
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    //звук
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 10) {
            return;
        }
        if (newSoundVolume < 0) {
            return;
        }
        this.soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }
        if (soundVolume == 10) {
            return;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
        if (soundVolume == 0) {
            return;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }
}
