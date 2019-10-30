package com.github.git_leon.dicerollsimulator;

@Deprecated
public class Bin {
    private Integer faceValueToTrack;
    private Integer numberOfOccurrences;

    public Bin(Integer faceValueToTrack) {
        this(faceValueToTrack, 0);
    }

    Bin(Integer faceValueToTrack, Integer numberOfOccurrences) {
        this.faceValueToTrack = faceValueToTrack;
        this.numberOfOccurrences = numberOfOccurrences;
    }

    public Integer getFaceValueToTrack() {
        return faceValueToTrack;
    }

    public Integer getNumberOfOccurrences() {
        return numberOfOccurrences;
    }

    public void increment() {
        numberOfOccurrences++;
    }
}
