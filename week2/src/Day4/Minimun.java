

// Task 1 - Find the minimum price in 'Xyz Travels'
package Day4;

import java.util.ArrayList;
import java.util.List;

public class Minimun {

	public static void main(String[] args) {
		
		
		List<Product> proList = new ArrayList<>();

		proList.add(new Product(105, "B Rice", 50, (float) 3.3, 1));
		proList.add(new Product(101, "A Rice", 44.5, (float) 4.4, 1));
		proList.add(new Product(104, "C Rice", 41, (float) 4.2, 1));
		proList.add(new Product(106, "F Rice", 41, (float) 4.05, 1));
		proList.add(new Product(101, "A Rice", 41.5, (float) 4.8, 2));
		proList.add(new Product(102, "E Rice", 122, (float) 5, 2));
		proList.add(new Product(103, "D Rice", 36, (float) 2.8, 0.8));
		proList.add(new Product(101, "A Rice", 42.5, (float) 4.4, 1));
		
		List<Product> busMin=new ArrayList<>();
		
		
		System.out.println("Original List:");
		proList.forEach(System.out::println);
		
		
		double min=proList.stream()
				.filter(e-> e.getName().equals("A Rice"))
				.map(e-> e.getCost())
				.reduce(Double.MAX_VALUE,(sum,element)-> (sum<element?sum:element));
		
		System.out.println("\n\n"+min);
		

	}

}
