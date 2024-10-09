package in.sbp.products.claasses;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Product {

	public void addProduct(Consumer<String> productConsumer, String product) {
		productConsumer.accept(product);
	}
	
	public String getProduct(Supplier<String> productSupplier) {
		return productSupplier.get();
	}
}
