package ru.netology.domain;

public class Radio {

    private int currentNumber;
    private int soundVolume;
    private int quantityNumber;

    public Radio() {
        quantityNumber = 10;
    }

    public Radio(int quantityNumber) {
        this.quantityNumber = quantityNumber;
    }

    public void setCurrentNumber(int newcurrentNumber) {
        if (newcurrentNumber > quantityNumber - 1) {
            return;
        }
        if (newcurrentNumber < 0) {
            return;
        }
        this.currentNumber = newcurrentNumber;
    }

    public void nextNumber() {
        if (currentNumber == quantityNumber - 1) {
            currentNumber = 0;
            return;
        }
        if (currentNumber < quantityNumber - 1) {
            currentNumber = currentNumber + 1;
        }

    }

    public void prevNumber() {
        if (currentNumber == 0) {
            currentNumber = quantityNumber - 1;
            return;
        }
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        }

    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    //звук
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 100) {
            return;
        }
        if (newSoundVolume < 0) {
            return;
        }
        this.soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
        if (soundVolume == 100) {
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
