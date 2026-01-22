class PaymentModule {
    private final LoggerService logger = LoggerService.getInstance();
    public void pay(double amount) {
        logger.info("Payment", "Payment processed: " + amount);
    }
}