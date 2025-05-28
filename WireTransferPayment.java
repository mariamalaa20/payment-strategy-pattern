public class WireTransferPayment implements IPaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid via wire transfer: $" + amount);
    }
}
