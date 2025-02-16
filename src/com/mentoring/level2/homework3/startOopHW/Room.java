package com.mentoring.level2.homework3.startOopHW;

public class Room {
    private final int roomNumber;
    private final RoomCharacteristic isThroughRoom;

    public Room(int roomNumber, RoomCharacteristic isThroughRoom) {
        this.roomNumber = roomNumber;
        this.isThroughRoom = isThroughRoom;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomCharacteristic getIsThroughRoom() {
        return isThroughRoom;
    }

    public void printRoom(){
        System.out.println("Room #" + roomNumber + isThroughRoom.getIsThroughRoom());
//        isThroughRoom.printRoomCharacteristic();
    }
}
