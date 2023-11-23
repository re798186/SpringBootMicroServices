package in.reethu.stocks.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.reethu.stocks.service.IStockPriceService;

@RestController
@RequestMapping("/price")
public class StockPriceController {

	@Autowired
	private IStockPriceService service;
	
	@Autowired
	Environment env;
	

	@GetMapping("/stockPrice/{companyName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable String companyName) {

		Double price = service.findByCompanyName(companyName);
		System.out.println(companyName + " " + price);
		System.out.println("Port No ::::::" + " " + env.getProperty("local.server.port"));

		return new ResponseEntity<Double>(price, HttpStatus.OK);
	}

}
