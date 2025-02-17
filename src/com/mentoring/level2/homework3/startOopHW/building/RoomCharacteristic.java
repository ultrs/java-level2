package com.mentoring.level2.homework3.startOopHW.building;

public class RoomCharacteristic {
    private final boolean isThroughRoom;


    public RoomCharacteristic(boolean isThroughRoom) {
        this.isThroughRoom = isThroughRoom;
    }

    public String getIsThroughRoom() {
        if (isThroughRoom) {
            return ", room is through";
        } else {
            return ", room is NOT through";
        }
    }

    public void printRoomCharacteristic(){
        if(isThroughRoom){
            System.out.println("room is through");
        } else {
            System.out.println("room is not through");
        }
    }

}
