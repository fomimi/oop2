package ru.netology.javaqa.RadioService.services;

public class Radio {
    private int currentRadioStationNumber;
    private int amountOfRadioStations = 10;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = amountOfRadioStations - 1;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int amountOfRadioStations) {
        this.amountOfRadioStations = amountOfRadioStations;
        maxRadioStationNumber = amountOfRadioStations - 1;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else if (newRadioStationNumber > maxRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
        } else {
            this.currentRadioStationNumber = newRadioStationNumber;
        }
    }

    public void next() {
        if (currentRadioStationNumber == maxRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == minRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else {
            currentRadioStationNumber--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            volume = minVolume;
        } else if (newVolume > maxVolume) {
            volume = maxVolume;
        } else {
            volume = newVolume;
        }
    }

    public void increaseVolumeByOne() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolumeByOne() {
        if (volume > minVolume) {
            volume--;
        }
    }


}
