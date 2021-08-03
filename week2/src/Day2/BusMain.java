package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusMain {

	public static void main(String[] args) {
		
		List<Bus> buslist=new ArrayList<>();
		buslist.add(new Bus(100,"a travels",100.00,2.3f));
		buslist.add(new Bus(101,"a travels",100.00,2.3f));
		buslist.add(new Bus(102,"a travels",100.00,2.3f));
		buslist.add(new Bus(103,"a travels",100.00,2.3f));
		
		PrintBus(buslist);
	    Collections.sort(buslist);

	}
	
	public static void PrintBus(List<Bus> buslist) {
		for (Bus bus : buslist) {
			System.out.println(bus);
		}
	}

}
