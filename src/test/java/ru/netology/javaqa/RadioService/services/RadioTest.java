package ru.netology.javaqa.RadioService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStationNumber0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberMinus1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber10() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber0AndNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber1AndNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber0AndPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber1AndPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber9AndNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber9AndPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        Radio radio = new Radio();
        radio.setVolume(1);
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMinus1() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99() {
        Radio radio = new Radio();
        radio.setVolume(99);
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume101() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0AndIncrease() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolumeByOne();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0AndDecrease() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolumeByOne();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1AndIncrease() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.increaseVolumeByOne();
        int expected = 2;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1AndDecrease() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolumeByOne();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99AndIncrease() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolumeByOne();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99AndDecrease() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.decreaseVolumeByOne();
        int expected = 98;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100AndIncrease() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolumeByOne();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100AndDecrease() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.decreaseVolumeByOne();
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}
