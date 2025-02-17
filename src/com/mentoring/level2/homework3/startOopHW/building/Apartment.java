package com.mentoring.level2.homework3.startOopHW.building;

public class Apartment {
    private final int apartmentNumber;
    private final Room[] roomNumber;

    public Apartment(int apartmentNumber, Room[] roomNumber) {
        this.apartmentNumber = apartmentNumber;
        this.roomNumber = roomNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public Room[] getRoomNumber() {
        return roomNumber;
    }

    public void printApartment() {
        System.out.println("Apartment #" + apartmentNumber + ", number of rooms: " + roomNumber.length);
    }

}
