public class Cart implements HotelService{

    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    private void requestCart(int numberOfCarts) {
        System.out.println("Number of carts requested: " + numberOfCarts);
    }

    @Override
    public void execute() {
        requestCart(numberOfCarts);
    }
}
