class ShippingService {
    public String createShipment(String userId, String itemId) {
        String tracking = "TRK-" + System.currentTimeMillis();
        System.out.println("Shipping: created shipment for " + itemId + " tracking=" + tracking);
        return tracking;
    }
}