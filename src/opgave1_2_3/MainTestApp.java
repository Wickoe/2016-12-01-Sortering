package opgave1_2_3;

import java.util.ArrayList;

public class MainTestApp {
	public static void main(String[] args) {
		assignmentOneTests();
	}

	public static void assignmentOneTests() {
		ArrayList<Customer> customers = initArrayListWithCustomer();

		System.out.println("Unsorted customer list");
		for (Customer c : customers) {
			System.out.println(c);
		}
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