package in.reethu.stocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class StockProjectAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockProjectAdminServerApplication.class, args);
	}

}
