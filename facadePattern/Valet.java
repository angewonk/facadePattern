package facadePattern;

class Valet implements HotelService {
    private String plateNumber;

    public void performTask() {
        pickUpVehicle(plateNumber);
    }

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Your vehicle " + plateNumber + " is currently being picked up");
    }
}