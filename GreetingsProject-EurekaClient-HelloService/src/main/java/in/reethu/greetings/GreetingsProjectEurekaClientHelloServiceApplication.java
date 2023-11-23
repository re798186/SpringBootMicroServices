package in.reethu.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetingsProjectEurekaClientHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingsProjectEurekaClientHelloServiceApplication.class, args);
	}

}
