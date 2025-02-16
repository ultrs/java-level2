package com.mentoring.level2.homework3.startOopHW;
/*
//Представить в виде классов и их композиции следующую модель.
//- Каждый дом содержит свой номер (int), и множество этажей (массив).
//- Каждый этаж содержит номер этажа (int), и множество квартир (массив).
//- Каждая квартира содержит свой номер (int), и множество комнат (массив).
//- Каждая комната содержит поле проходная она или нет (boolean).

//В каждом классе реализовать метод print, который на консоль выводит информацию об объекте
//(должны присутствовать все поля объекта!).
//Например, метод print класса этаж должен выводить на консоль:
//“Этаж 2, количество квартир 18”

Создание всех объектов вынести в отдельный класс с методом main.

Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */

public class Task1Runner {

    public static void main(String[] args) {
        RoomCharacteristic roomCharacteristicY = new RoomCharacteristic(true);
        RoomCharacteristic roomCharacteristicN = new RoomCharacteristic(false);

        Room room1 = new Room(1, roomCharacteristicY);
        Room room2 = new Room(2, roomCharacteristicN);
        Room room3 = new Room(3, roomCharacteristicN);

        Apartment apartment1 = new Apartment(1, new Room[]{room1, room2, room3});
        Apartment apartment2 = new Apartment(2, new Room[]{room3});
        Apartment apartment3 = new Apartment(3, new Room[]{room1, room2});
        Apartment apartment4 = new Apartment(4, new Room[]{room2, room3});

        Floor floor1 = new Floor(1, new Apartment[]{apartment1, apartment2, apartment3, apartment4});
        Floor floor2 = new Floor(2, new Apartment[]{apartment1, apartment2, apartment3, apartment4});

        Building building = new Building(1, new Floor[]{floor1, floor2});

//        building.printBuilding();
//        apartment1.printApartment();
//        room1.printRoom();
        printAllInformation(building);
    }

    private static void printAllInformation(Building building) {
        System.out.println("Building #" + building.getBuildingNumber() + ", number of floors: "
                + building.getFloorNumber().length + ";");
        for (int i = 0; i < building.getFloorNumber().length; i++) {
            System.out.println("    Floor #" + building.getFloorNumber()[i].getFloorNumber()
                    + ", number of apartments: " + building.getFloorNumber()[i].getApartmentNumber().length + ";");
            for (int j = 0; j < building.getFloorNumber()[i].getApartmentNumber().length; j++) {
                System.out.println("        Apartment #" + building.getFloorNumber()[i].getApartmentNumber()[j]
                        .getApartmentNumber() + ", number of rooms: " + building.getFloorNumber()[i]
                        .getApartmentNumber()[j].getRoomNumber().length + ";");
                for (int k = 0; k < building.getFloorNumber()[i].getApartmentNumber()[j].getRoomNumber().length; k++) {
                    System.out.println("            Room #" + building.getFloorNumber()[i].getApartmentNumber()[j]
                            .getRoomNumber()[k].getRoomNumber() + building.getFloorNumber()[i].getApartmentNumber()[j]
                            .getRoomNumber()[k].getIsThroughRoom().getIsThroughRoom() + ".");
                }
            }
        }
    }
}
