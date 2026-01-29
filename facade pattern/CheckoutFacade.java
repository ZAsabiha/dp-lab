class CheckoutFacade {
    private final InventoryService inventory = new InventoryService();
    private final PaymentGateway payment = new PaymentGateway();
    private final ShippingService shipping = new ShippingService();
    private final NotificationService notification = new NotificationService();

    public void placeOrder(String userId, String itemId, double amount) {
        if (!inventory.isInStock(itemId)) {
            notification.sendConfirmation(userId, "Sorry, item is out of stock.");
            return;
        }

        inventory.reserve(itemId);

        if (!payment.charge(userId, amount)) {
            notification.sendConfirmation(userId, "Payment failed. Order cancelled.");
            return;
        }

        String tracking = shipping.createShipment(userId, itemId);
        notification.sendConfirmation(userId, "Order placed! Tracking: " + tracking);
    }
}