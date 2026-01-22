class AuthModule {
    private final LoggerService logger = LoggerService.getInstance();
    public void login(String user) {
        logger.info("Auth", "User logged in: " + user);
    }
}