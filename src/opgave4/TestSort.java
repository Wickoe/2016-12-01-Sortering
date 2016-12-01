package opgave4;

import java.util.ArrayList;
import java.util.Collections;

import opgave1_2_3.Customer;

public class TestSort {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Jan");
		list.add("Bent");
		list.add("Thomas");
		list.add("Karsten");
		list.add("Dan");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		ArrayList<Customer> customers = initArrayListWithCustomer();
		System.out.println(customers);
		Collections.sort(customers);
		System.out.println(customers);
	}

	private static ArrayList<Customer> initArrayListWithCustomer() {
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Martin", "Hansen", 23));
		customers.add(new Customer("Niels", "Bekhøj", 6));
		customers.add(new Customer("Johan", "Behrens", 102));
		customers.add(new Customer("Mogens", "Hansen", 73));
		customers.add(new Customer("Marie", "Terp", 31));
		customers.add(new Customer("Marie", "Behrens", 45));
		customers.add(new Customer("Maria", "Hansen", 23));
		customers.add(new Customer("Ditlev", "Næser", 20));
		customers.add(new Customer("Ulla", "Behrens", 23));
		customers.add(new Customer("Jens Kristian", "Behrens", 55));
		customers.add(new Customer("Astrid", "Næser", 55));
		customers.add(new Customer("Johan", "Behrens", 25));
		return customers;
	}
}