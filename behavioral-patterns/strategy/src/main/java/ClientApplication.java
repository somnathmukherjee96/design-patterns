import context.PaymentContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import strategy.CreditCardPayment;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		PaymentContext creditCardPaymentContext = new PaymentContext();
		creditCardPaymentContext.setPaymentStrategy(new CreditCardPayment("1111 2222 3333 4444", "Somnath Mukherjee"));
		creditCardPaymentContext.pay(1200);

	}

}
