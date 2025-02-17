package com.mentoring.level2.homework3.startOopHW.building;

public class Floor {
    private final int floorNumber;
    private final Apartment[] apartmentNumber;

    public Floor(int floorNumber, Apartment[] apartmentNumber) {
        this.floorNumber = floorNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Apartment[] getApartmentNumber() {
        return apartmentNumber;
    }

    public void printFloor() {
        System.out.println("Floor #" + floorNumber + ", number of apartments: " + apartmentNumber.length);
    }

}
