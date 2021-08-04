package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {

		List<Product> proList = new ArrayList<>();

		proList.add(new Product(105, "B Rice", 50, (float) 3.3, 1));
		proList.add(new Product(104, "C Rice", 41, (float) 4.2, 1));
		proList.add(new Product(106, "F Rice", 41, (float) 4.05, 1));
		proList.add(new Product(101, "A Rice", 44.5, (float) 4.8, 2));
		proList.add(new Product(102, "E Rice", 122, (float) 5, 2));
		proList.add(new Product(103, "D Rice", 36, (float) 2.8, 0.8));

		printProduct(proList);

		Collections.sort(proList, (Product p1, Product p2) -> {
			Integer i1 = p1.getId();
			Integer i2 = p2.getId();
			return i1.compareTo(i2);
		});
		System.out.println("\n\n\"Sorting witd ID\"\n\n");
		printProduct(proList);
		
		Collections.sort(proList,(Product p1,Product p2)->{
			return p1.getName().compareTo(p2.getName());
		});
		System.out.println("\n\n\"Sorting witd Name of Product\"\n\n");
		printProduct(proList);
		
		Collections.sort(proList,(Product p1,Product p2)->{
			Double d1=p1.getCost();
			Double d2=p2.getCost();
			int x= d2.compareTo(d1);
			if(x==0)
			{
				Float f1=p1.getRating();
				Float f2=p2.getRating();
				x=f2.compareTo(f1);
			}
			return x;
		});
		
		System.out.println("\n\n\"Sorting witd Cost of Product if Same cost then by rating \"\n\n");
		printProduct(proList);
		
		

	}

	public static void printProduct(List<Product> proList) {
		for (Product product : proList) {
			System.out.println(product);
		}
	}

}
