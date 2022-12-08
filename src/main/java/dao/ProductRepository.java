package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

	public static ProductRepository getInstance(){
		return instance;
	} 

	public ProductRepository() {
		Product phone = new Product("P1234", "The Real", 25000);
		phone.setDescription("닭고기, 1.6kg, adult");
		phone.setCategory("고양이 사료");
		phone.setManufacturer("하림");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		phone.setFilename("P1234.jpg");

		Product notebook = new Product("P1235", "탐사 고양이모래", 15000);
		notebook.setDescription("일반입자형, 무향, 벤토나이트");
		notebook.setCategory("고양이 모래");
		notebook.setManufacturer("탐사");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("New");
		notebook.setFilename("P1235.jpg");

		Product tablet = new Product("P1236", "고양이 간식", 10000);
		tablet.setDescription("연어,  닭고기, 참치");
		tablet.setCategory("고양이 간식");
		tablet.setManufacturer("펫둥이");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("New");
		tablet.setFilename("P1236.jpg");

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
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
