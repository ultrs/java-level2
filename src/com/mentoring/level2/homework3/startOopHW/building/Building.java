package com.mentoring.level2.homework3.startOopHW.building;

public class Building {
    private final int buildingNumber;
    private final Floor[] floorNumber;

    public Building(int buildingNumber, Floor[] floorNumber) {
        this.buildingNumber = buildingNumber;
        this.floorNumber = floorNumber;
    }

    public void printBuilding() {
        System.out.println("Building #" + buildingNumber + ", number of floors: " + floorNumber.length);
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public Floor[] getFloorNumber() {
        return floorNumber;
    }
}
