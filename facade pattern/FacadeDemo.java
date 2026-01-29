public class FacadeDemo {
    public static void main(String[] args) {
        CheckoutFacade checkout = new CheckoutFacade();
        checkout.placeOrder("user-71", "item-ABC", 499.99);
    }
}
