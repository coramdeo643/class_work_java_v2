package com.composition;

public class House {

    private String address;
    Room[] rooms;

    public House(String address) {
        this.address = address;
        this.rooms = new Room[3]; // 컴포지션, House 가 Room 배열 소유함
        rooms[0] = new Room("Living room");
        rooms[1] = new Room("Bedroom");
        rooms[2] = new Room("Kitchen");
        // 속성으로 선언되고 내부에서 객체 생성했기 때문에 컴포지션이라 할수있음
        // room = new Room("Living room");
    }

    void showRooms() {
        System.out.println(address + " 에 있는 방 목록 : ");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                rooms[i].describe();
            } // end of if
        } // end of for
    }

    // test code
    public static void main(String[] args) {
        House house = new House("부산진구 전포동 그린로 101");
        house.showRooms();
        // house 객체가 소멸이 되면 rooms 도 Room 객체도 소멸(GC; Garbage collector,에 의해 소멸됨)
        house = null;
    }

} // end of class
