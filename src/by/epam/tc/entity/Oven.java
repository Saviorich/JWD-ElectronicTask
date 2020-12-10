package by.epam.tc.entity;

public class Oven extends ElectronicEquipment {
    private final int POWER_CONSUMPTION;
    private final int WEIGHT;
    private final int CAPACITY;
    private final int DEPTH;
    private final double HEIGHT;
    private final double WIDTH;

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        this.POWER_CONSUMPTION = powerConsumption;
        this.WEIGHT = weight;
        this.CAPACITY = capacity;
        this.DEPTH = depth;
        this.HEIGHT = height;
        this.WIDTH = width;
    }
}
