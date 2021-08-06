package Set_problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;




public class ProductMain {

	public static void main(String[] args) {

		Set<Product> proList=new HashSet<>();

		proList.add(new Product(105, "B Rice", 50, (float) 3.3, 1));
		proList.add(new Product(104, "C Rice", 41, (float) 4.2, 1));
		proList.add(new Product(104, "C Rice", 41, (float) 4.2, 1));
		proList.add(new Product(106, "F Rice", 41, (float) 4.05, 1));
		proList.add(new Product(106, "F Rice", 41, (float) 4.05, 1));
		proList.add(new Product(101, "A Rice", 44.5, (float) 4.8, 2));
		proList.add(new Product(101, "A Rice", 44.5, (float) 4.8, 2));
		proList.add(new Product(102, "E Rice", 122, (float) 5, 2));
		proList.add(new Product(102, "E Rice", 122, (float) 5, 2));
		proList.add(new Product(103, "D Rice", 36, (float) 2.8, 0.8));
		
		
		printProduct(proList);
		
		
//		List<Product> li=new ArrayList<Product>(proList);
//		
//		Collections.sort(li,(Product p1,Product p2)->{
//			Integer i1=p1.getId();
//			Integer i2=p2.getId();
//			return i1.compareTo(i2);
//		});
//		
//		
//		System.out.println("\n\n");
//		printProduct(proList);
		
		
		
				
			
		
	}

	public static void printProduct(Set<Product> proList) {
		Iterator<Product> i = proList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
