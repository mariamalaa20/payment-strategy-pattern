public class CreditCardPayment implements IPaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid with credit card: $" + amount);
    }
}
