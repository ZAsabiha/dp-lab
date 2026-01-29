class PaymentGateway {
    public boolean charge(String userId, double amount) {
        System.out.println("Payment: charging user " + userId + " amount " + amount);
        return true; 
    }
}