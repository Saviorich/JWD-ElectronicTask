package by.epam.tc.entity;

public class Refrigerator extends ElectronicEquipment {
    private final int POWER_CONSUMPTION;
    private final int WEIGHT;
    private final int FREEZER_CAPACITY;
    private final int OVERALL_CAPACITY;
    private final int HEIGHT;

    public Refrigerator (int powerConsumption, int weight, int freezerCapacity, int overallCapacity, int height) {
        this.POWER_CONSUMPTION = powerConsumption;
        this.WEIGHT = weight;
        this.FREEZER_CAPACITY = freezerCapacity;
        this.OVERALL_CAPACITY = overallCapacity;
        this.HEIGHT = height;
    }
}
