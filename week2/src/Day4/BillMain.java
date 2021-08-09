package Day4;

import java.util.ArrayList;
import java.util.List;

import Day1.Product;

public class BillMain extends Bill_print{

	public BillMain(String item_name, int quantity, double total) {
		super(item_name, quantity, total);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Bill_print> bill = new ArrayList<>();

		bill.add(new Bill_print("Dal Makhni", 1, 300));
		bill.add(new Bill_print("Chicken Masala", 2, 200));
		bill.add(new Bill_print("Butter Naan", 15, 10));
		bill.add(new Bill_print("Steam Rice", 1, 50));
		bill.add(new Bill_print("Coke", 2, 10));

		System.out.println("Item    Quantity   Cost    Total");
		

		System.out.println("Original List:");
		bill.forEach(System.out::println);

		double total = bill.stream().map(e -> e.getTotal()).reduce(0.0d, (sum, element) -> sum + element);

		System.out.println("\nTotal: " + total);

//		System.out.println("\nSubtotal"+ (total+()));
		double BillTotal = bill.stream().map(e -> e.getBillwithTax()).reduce(0.0d, (sum, element) -> sum + element);
		System.out.println("\nTotal with Tax: " + BillTotal);

	}
	
	

}
