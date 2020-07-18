/**
 * 
 */
package streamexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Javed
 *
 */
public class StreamBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<String> pnames = productsList.stream().filter(p -> p.price < 50000).map(pm -> pm.name).collect(Collectors.toList());
		System.out.println(pnames);
	}

}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
