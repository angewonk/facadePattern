package facadePattern;

class FrontDesk {
    public void assign(HotelService service) {
        service.performTask();
    }
}