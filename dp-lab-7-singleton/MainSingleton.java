public class MainSingleton {
    public static void main(String[] args) {
        new AuthModule().login("Sabiha");
        new PaymentModule().pay(500.0);
        new ReportingModule().generate();
        new NotificationModule().send("admin@company.com");

       
        System.out.println("Same logger? " +
            (LoggerService.getInstance() == LoggerService.getInstance()));
    }
   
}
