package in.reethu.stocks.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockService {

	public String getTotalStockPrice(String companyName, Integer quantity) {

		String REST_END_POINT = "http://localhost:5555/calc/calculate/{companyName}/{quantity}";//through spring cloud gateway
		String response = null;

		WebClient webClient = WebClient.create();
		
		try {
			response=webClient.
					get().
					uri(REST_END_POINT, companyName,quantity).
					retrieve().
					bodyToMono(String.class).
					block();
			
		}catch(Exception e) {
			response="CompanyName not found";
		}

		return response;
	}

}
