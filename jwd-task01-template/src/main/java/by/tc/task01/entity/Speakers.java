package by.tc.task01.entity;

import java.io.Serializable;

public class Speakers extends Appliance implements Serializable {
    private int powerConsumption;
    private int numberSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
    }

    public Speakers(int powerConsumption, int numberSpeakers, String frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberSpeakers = numberSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberSpeakers() {
        return numberSpeakers;
    }

    public void setNumberSpeakers(int numberSpeakers) {
        this.numberSpeakers = numberSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Speakers speakers = (Speakers) o;

        if (powerConsumption != speakers.powerConsumption) {
            return false;
        }
        if (numberSpeakers != speakers.numberSpeakers) {
            return false;
        }
        if (cordLength != speakers.cordLength) {
            return false;
        }
        return frequencyRange != null ? frequencyRange.equals(speakers.frequencyRange) : speakers.frequencyRange == null;
    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + numberSpeakers;
        result = 31 * result + (frequencyRange != null ? frequencyRange.hashCode() : 0);
        result = 31 * result + cordLength;
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberSpeakers=" + numberSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }
}
