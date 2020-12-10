package by.epam.tc.entity;

public class VacuumCleaner extends ElectronicEquipment{
    private final int POWER_CONSUMPTION;
    private final char FILTER_TYPE;
    private final String BAG_TYPE;
    private final String WAND_TYPE;
    private final int MOTOR_SPEED_REGULATION;
    private final int CLEANING_WIDTH;

    public VacuumCleaner(
            int powerConsumption,
            char filterType,
            String bagType,
            String wandType,
            int motorSpeedRegulation,
            int cleaningWidth)
    {
        this.POWER_CONSUMPTION = powerConsumption;
        this.FILTER_TYPE = filterType;
        this.BAG_TYPE = bagType;
        this.WAND_TYPE = wandType;
        this.MOTOR_SPEED_REGULATION = motorSpeedRegulation;
        this.CLEANING_WIDTH = cleaningWidth;
    }
}
