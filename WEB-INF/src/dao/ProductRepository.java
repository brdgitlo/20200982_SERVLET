package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅

	public ProductRepository() {
		Product ALPA = new Product("P1234", "ALPA1", 20000);
		ALPA.setDescription("size 250-300, Non-slip");
		ALPA.setCategory("SOCKS");
		ALPA.setManufacturer("PB");
		ALPA.setUnitsInStock(1000);
		ALPA.setCondition("New");
        
        Product BETA = new Product("P1235", "BETA1", 25000);
		BETA.setDescription("size 250-300, Non-slip");
		BETA.setCategory("SOCKS");
	    BETA.setManufacturer("PB");
		BETA.setUnitsInStock(1000);
		BETA.setCondition("New");

		Product PRO = new Product("P1236", "PRO1", 30000);
        PRO.setDescription("size 250-300, Non-slip");
		PRO.setCategory("SOCKS");
	    PRO.setManufacturer("PB");
		PRO.setUnitsInStock(1000);
		PRO.setCondition("New");
        
        Product ELITE = new Product("P1237", "ELITE", 40000);
        ELITE.setDescription("size 250-300, Non-slip");
		ELITE.setCategory("SOCKS");
	    ELITE.setManufacturer("PB");
		ELITE.setUnitsInStock(1000);
		ELITE.setCondition("New");

		
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(ALPA);
		listOfProducts.add(BETA);
		listOfProducts.add(PRO);
        listOfProducts.add(ELITE);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
}