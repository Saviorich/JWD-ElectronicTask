/*ElectronicEquipment equipment;
        switch (type) {
            case "Oven":
                equipment = new Oven();
                break;
            case "TabletPC":
                equipment = new TabletPC();
                break;
            case "Laptop":
                equipment = new Laptop();
                break;
            case "Refrigerator":
                equipment = new Refrigerator();
                break;
            case "Speakers":
                equipment = new Speakers();
                break;
            case "VacuumCleaner":
                equipment = new VacuumCleaner();
                break;
            default:
                throw new IllegalArgumentException("Wrong equipment type:" + type);
        }
        return equipment;*/
package by.epam.tc.factory;

import by.epam.tc.entity.*;

public class ElectronicEquipmentFactory {

    public ElectronicEquipment getElectronicEquipment(ElectronicEquipmentType type, Object... params) {
        ElectronicEquipment equipment;
        switch (type) {
            case OVEN:
                equipment = new Oven(
                        (int) params[0],
                        (int) params[1],
                        (int) params[2],
                        (int) params[3],
                        (double) params[4],
                        (double) params[5]
                );
                break;
            case TABLET_PC:
                equipment = new TabletPC(
                        (int) params[0],
                        (int) params[1],
                        (int) params[2],
                        (int) params[3],
                        (String) params[4]
                );
                break;
            case LAPTOP:
                equipment = new Laptop(
                        (int) params[0],
                        (String) params[1],
                        (int) params[2],
                        (int) params[3],
                        (double) params[4],
                        (int) params[5]
                );
                break;
            case REFRIGERATOR:
                equipment = new Refrigerator(
                        (int) params[0],
                        (int) params[1],
                        (int) params[2],
                        (int) params[3],
                        (int) params[4]
                );
                break;
            case SPEAKERS:
                equipment = new Speakers(
                        (int) params[0],
                        (int) params[1],
                        (String) params[2],
                        (int) params[3]
                );
                break;
            case VACUUM_CLEANER:
                equipment = new VacuumCleaner(
                        (int) params[0],
                        (char) params[1],
                        (String) params[2],
                        (String) params[3],
                        (int) params[4],
                        (int) params[5]
                );
                break;
            default:
                throw new IllegalArgumentException("Wrong equipment type:" + type);
        }
        return equipment;
    }

    public ElectronicEquipment getElectronicEquipment(
            double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInches)
    {
        return new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }

    public ElectronicEquipment getElectronicEquipment(
            int powerConsumption, int weight, int capacity, int depth, double height, double width)
    {
        return new Oven(powerConsumption, weight, capacity, depth, height, width);
    }

    public ElectronicEquipment getElectronicEquipment(
            int powerConsumption, int weight, int freezerCapacity, int overallCapacity, int height)
    {
        return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height);
    }

    public ElectronicEquipment getElectronicEquipment(
            int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength)
    {
        return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    public ElectronicEquipment getElectronicEquipment(
            int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String color)
    {
        return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    public  ElectronicEquipment getElectronicEquipment(int powerConsumption,
                                                       char filterType,
                                                       String bagType,
                                                       String wandType,
                                                       int motorSpeedRegulation,
                                                       int cleaningWidth)
    {
        return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
