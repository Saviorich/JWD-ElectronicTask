package by.epam.tc.entity;

public class TabletPC extends ElectronicEquipment {
    private final int BATTERY_CAPACITY;
    private final int DISPLAY_INCHES;
    private final int MEMORY_ROM;
    private final int FLASH_MEMORY_CAPACITY;
    private final String COLOR;

    public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String color) {
        this.BATTERY_CAPACITY = batteryCapacity;
        this.DISPLAY_INCHES = displayInches;
        this.MEMORY_ROM = memoryRom;
        this.FLASH_MEMORY_CAPACITY = flashMemoryCapacity;
        this.COLOR = color;
    }
}
