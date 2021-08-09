/*Task 2 - Calculate total and print bill.
	          Item Name          Price    Qty.    Line Total
	          Line Total = Price * Qty.
	          Bill Total = Total of Line Total + 5% tax;
	          Items needs to be sorted based on Item Name.
*/

package Day4;

public class Bill_print {
	private String item_name;
	private int quantity;
	private double cost;

	public Bill_print(String item_name, int quantity, double total) {
		super();
		this.item_name = item_name;
		this.quantity = quantity;
		this.cost = total;

	}

	public String getItem_name() {
		return item_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getCost() {
		return cost;
	}

	public double getTotal() {
		return (getCost() * getQuantity());
	}

	public double getBillwithTax() {
		return (getTotal() + (0.05) * getTotal());
	}
	
	public void printBill() {
		System.out.printf("%-15s %1d %5d %5d\n",item_name,quantity,cost,"Total");
	}

}
