package in.sbp.products;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import in.sbp.products.claasses.Product;

public class App {

	public static void main(String[] args) {
		List<String> productList = 
				new ArrayList<>();
		
		Product product = new Product();
		
//		Consumer<String> addProduct = str->productList.add(str);
		Consumer<String> addProduct = productList::add;
		
		product.addProduct(addProduct, "Sugar");
		product.addProduct(addProduct, "Oil");
		product.addProduct(addProduct, "Salt");
		
		int index=0;
//		Supplier<String> getProduct = ;
		
		String firstProduct=product.getProduct(()->productList.get(0));
		String secondProduct=product.getProduct(()->productList.get(1));
		String thirdProduct=product.getProduct(()->productList.get(2));
		
		System.out.println(firstProduct);
		System.out.println(secondProduct);
		System.out.println(thirdProduct);
	}
}
