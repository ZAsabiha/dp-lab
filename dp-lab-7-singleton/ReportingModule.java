class ReportingModule {
    private final LoggerService logger = LoggerService.getInstance();
    public void generate() {
        logger.warn("Reporting", "Report generation is slow");
    }
}