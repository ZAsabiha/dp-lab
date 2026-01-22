class LoggerService {
    private static volatile LoggerService instance;   
    private LoggerService() {}                       

    public static LoggerService getInstance() {
        if (instance == null) {
            synchronized (LoggerService.class) {
                if (instance == null) {
                    instance = new LoggerService();
                }
            }
        }
        return instance;
    }

    public void info(String module, String msg) {
        System.out.println("[INFO] [" + module + "] " + msg);
    }

    public void warn(String module, String msg) {
        System.out.println("[WARN] [" + module + "] " + msg);
    }

    public void error(String module, String msg) {
        System.out.println("[ERROR] [" + module + "] " + msg);
    }
}
