package strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder){
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using credit card. Card holder: "+cardHolder);
    }
}
