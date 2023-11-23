package in.reethu.stocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GreetPrijectCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetPrijectCloudConfigServerApplication.class, args);
	}

}
