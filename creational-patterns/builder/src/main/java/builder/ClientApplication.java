package builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		DesktopDirector dellDirector = new DesktopDirector(new DellDesktopBuilder());
		DesktopDirector hpDirector = new DesktopDirector(new HpDesktopBuilder());

		Desktop dellDesktop = dellDirector.buildDesktop();
		dellDesktop.showSpec();
		Desktop hpDesktop = hpDirector.buildDesktop();
		hpDesktop.showSpec();
	}

}
