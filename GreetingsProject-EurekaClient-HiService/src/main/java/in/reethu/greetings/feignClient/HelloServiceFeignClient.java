package in.reethu.greetings.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="HELLO-SERVICE")
public interface HelloServiceFeignClient {
	@GetMapping("/api/hello/{name}")
	public String getHello(@PathVariable String name) ;
}
