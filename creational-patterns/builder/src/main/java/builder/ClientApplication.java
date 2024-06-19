package builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		DesktopDirector desktopDirector1 = new DesktopDirector(new DellDesktopBuilder());
		DesktopDirector desktopDirector2 = new DesktopDirector(new HpDesktopBuilder());

		Desktop desktop1 = desktopDirector1.buildDesktop();
		desktop1.showSpec();
		Desktop desktop2 = desktopDirector2.buildDesktop();
		desktop2.showSpec();
	}

}
