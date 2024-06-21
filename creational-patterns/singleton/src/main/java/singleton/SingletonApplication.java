package singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import singleton.eager.DBConnectionEager;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);
		DBConnectionEager connection1 = DBConnectionEager.getInstance();
		DBConnectionEager connection2 = DBConnectionEager.getInstance();
		connection1.connect();

		System.out.println("The two objects are same ? "+((connection1==connection2)?"Yes":"No"));
	}

}
