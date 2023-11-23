package in.reethu.greetings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.reethu.greetings.feignClient.HelloServiceFeignClient;

@RestController
public class HiServiceController {
	
	@Autowired
	HelloServiceFeignClient client;
	
	@GetMapping("/api/hi/{name}")
	public String sayHi(@PathVariable String name) {
		String helloMsg = client.getHello(name);
		return "Hi "+name +helloMsg ;
	}

}
