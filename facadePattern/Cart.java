package facadePattern;

class Cart implements HotelService {
    private int cartNum;

    public void performTask() {
        requestCart(cartNum);
    }

    public void requestCart(Integer numberOfCarts) {
        System.out.println(numberOfCarts + " carts has been requested");
    }

    public Cart(Integer cartNum) {
        this.cartNum = cartNum;
    }

}