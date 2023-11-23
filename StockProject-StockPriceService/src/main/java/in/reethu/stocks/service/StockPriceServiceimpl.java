package in.reethu.stocks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.reethu.stocks.entity.StockPrice;
import in.reethu.stocks.exception.StockNotFoundException;
import in.reethu.stocks.repository.StockRepository;

@Service
public class StockPriceServiceimpl implements IStockPriceService {

	@Autowired
	private StockRepository repo;

	@Override
	public Double findByCompanyName(String companyName) {

		StockPrice stockPrice = repo.findByCompanyName(companyName);
		if (stockPrice == null) {
			throw new StockNotFoundException("Company not vailable");
		}

		return stockPrice.getCompanyPrice();
	}

}
