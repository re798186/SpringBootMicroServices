package in.reethu.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GreetingsProjectEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingsProjectEurekaServerApplication.class, args);
	}

}
