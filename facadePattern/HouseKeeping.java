package facadePattern;

class HouseKeeping implements HotelService {
    private String roomNumber;

    public HouseKeeping(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void performTask() {
        cleanRoom(roomNumber);
    }

    public void cleanRoom(String roomNumber) {
        System.out.println("Your room " + roomNumber + " will be cleaned in just a bit");
    }
}