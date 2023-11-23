package in.reethu.stocks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.reethu.stocks.entity.StockPrice;

public interface StockRepository extends JpaRepository<StockPrice, Integer> {
	public StockPrice findByCompanyName(String companyName);
}
