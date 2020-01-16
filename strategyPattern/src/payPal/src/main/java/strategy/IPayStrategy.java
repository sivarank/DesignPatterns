package payPal.src.main.java.strategy;

public interface IPayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
