package context;

import strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(double amount){
        if(paymentStrategy == null) throw new IllegalStateException("Payment strategy is not set.");
        paymentStrategy.pay(amount);
    }
}
