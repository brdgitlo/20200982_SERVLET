package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅
    private static ProductRepository instance = new ProductRepository();

     public static ProductRepository getInstance(){
	return instance;
   }

	public ProductRepository() {
		Product ALPA = new Product("P1234", "ALPA", 20000);
        ALPA.setFilename("P1234.jpg");
		ALPA.setDescription("size 250-300, Non-slip");
		ALPA.setCategory("SOCKS");
		ALPA.setManufacturer("PB");
		ALPA.setUnitsInStock(1000);
		ALPA.setCondition("New");
        
        Product BETA = new Product("P1235", "BETA", 25000);
        BETA.setFilename("P1235.jpg");
		BETA.setDescription("size 250-300, Non-slip");
		BETA.setCategory("SOCKS");
	    BETA.setManufacturer("PB");
		BETA.setUnitsInStock(1000);
		BETA.setCondition("New");

		Product PRO = new Product("P1236", "PRO", 30000);
        PRO.setFilename("P1236.jpg");
        PRO.setDescription("size 250-300, Non-slip, Basic");
		PRO.setCategory("SOCKS");
	    PRO.setManufacturer("PB");
		PRO.setUnitsInStock(1000);
		PRO.setCondition("New");
        
        Product PRO1 = new Product("P12361", "PRO1", 30000);
        PRO1.setFilename("P12361.jpg");
        PRO1.setDescription("size 250-300, Non-slip, Speed");
		PRO1.setCategory("SOCKS");
	    PRO1.setManufacturer("PB");
		PRO1.setUnitsInStock(1000);
		PRO1.setCondition("New");
        
        Product PRO2 = new Product("P12362", "PRO2", 30000);
        PRO2.setFilename("P12362.jpg");
        PRO2.setDescription("size 250-300, Non-slip, change direction");
		PRO2.setCategory("SOCKS");
	    PRO2.setManufacturer("PB");
		PRO2.setUnitsInStock(1000);
		PRO2.setCondition("New");
        
        Product ELITE = new Product("P1237", "ELITE", 40000);
        ELITE.setFilename("P1237.jpg");
        ELITE.setDescription("size 250-300, Non-slip");
		ELITE.setCategory("SOCKS");
	    ELITE.setManufacturer("PB");
		ELITE.setUnitsInStock(1000);
		ELITE.setCondition("New");

		
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(ALPA);
		listOfProducts.add(BETA);
		listOfProducts.add(PRO);
        listOfProducts.add(PRO1);
        listOfProducts.add(PRO2);
        listOfProducts.add(ELITE);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}

public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
    }
     public void addProduct(Product product) {
	listOfProducts.add(product);
    }
}