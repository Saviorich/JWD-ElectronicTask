package by.epam.tc.entity;

public class Laptop extends ElectronicEquipment {
    private final double BATTERY_CAPACITY;
    private final String OS;
    private final int MEMORY_ROM;
    private final int SYSTEM_MEMORY;
    private final double CPU;
    private final int DISPLAY_INCHES;

    public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInches) {
        this.BATTERY_CAPACITY = batteryCapacity;
        this.OS = os;
        this.MEMORY_ROM = memoryRom;
        this.SYSTEM_MEMORY = systemMemory;
        this.CPU = cpu;
        this.DISPLAY_INCHES = displayInches;
    }
}
