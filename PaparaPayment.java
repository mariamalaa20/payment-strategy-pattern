public class PaparaPayment implements IPaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid using Papara: $" + amount);
    }
}
