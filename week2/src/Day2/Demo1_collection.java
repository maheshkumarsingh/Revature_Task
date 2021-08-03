package Day2;

import java.util.ArrayList;
import java.util.List;

public class Demo1_collection {

	public static void main(String[] args) {

		List li = new ArrayList<>();

		li.add("hey");
		li.add(13444);
		li.add(22.111);
		li.add(new Object());

		System.out.println("li:" + li);

		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(1222);
		li2.add(100);
		li2.add(null);// insert at last

		System.out.println("li2" + li2);

		li2.add(1, 9000); // insert at specific index
		System.out.println(li2);

		li2.set(1, 9999);// update

		System.out.println(li2);

		System.out.println(li2.size());

		System.out.println(li2.get(3));

		for (int i = 0; i < li2.size(); i++) {
			System.out.println(li2.get(i));
		}

		for (Integer integer : li2) {
			System.out.println(integer);
		}

		li2.remove(1);
		System.out.println(li2);

		Integer i = 1222;
		li2.remove(i);
		System.out.println(li2);

		while (li2.remove(i)) {
		}
		System.out.println(li2);

		System.out.println(li2.contains(100));

		li2.add(98774);
		li2.add(14567);
		li2.add(1345);
		li2.add(222);
		System.out.println(li2);

	}

}
