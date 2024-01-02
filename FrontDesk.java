public class FrontDesk {
    private HotelService valet;
    private HotelService houseKeeping;
    private HotelService cart;

    public FrontDesk() {
        this.valet = new Valet("");
        this.houseKeeping = new HouseKeeping(0);
        this.cart = new Cart(0);
    }

    public void checkIn(String plateNumber, int roomNumber, int numberOfCarts) {
        valet = new Valet(plateNumber);
        houseKeeping = new HouseKeeping(roomNumber);
        cart = new Cart(numberOfCarts);

        valet.execute();
        houseKeeping.execute();
        cart.execute();

        System.out.println("\nGuest has successfully checked in!\n-----------------------");
    }

}
