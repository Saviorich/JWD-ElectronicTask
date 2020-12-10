package by.epam.tc.entity;

public class Speakers extends ElectronicEquipment {
    private final int POWER_CONSUMPTION;
    private final int NUMBER_OF_SPEAKERS;
    private final String FREQUENCY_RANGE;
    private final int CORD_LENGTH;

    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
        this.POWER_CONSUMPTION = powerConsumption;
        this.NUMBER_OF_SPEAKERS = numberOfSpeakers;
        this.FREQUENCY_RANGE = frequencyRange;
        this.CORD_LENGTH = cordLength;
    }
}
