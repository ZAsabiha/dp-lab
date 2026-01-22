class NotificationModule {
    private final LoggerService logger = LoggerService.getInstance();
    public void send(String to) {
        logger.info("Notification", "Notification sent to: " + to);
    }
}