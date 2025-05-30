public class PaymentProcessor {
    private IPaymentMethod paymentMethod;

    public void setPaymentMethod(IPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        if (paymentMethod == null) {
            System.out.println("No payment method selected.");
        } else {
            paymentMethod.makePayment(amount);
        }
    }
}
