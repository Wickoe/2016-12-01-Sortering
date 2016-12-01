package opgave1_2_3;

import java.util.ArrayList;

public class MainTestApp {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Assignment 1: Use bubble sort to sort an array of strings");
		assignmentOneTests();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Assignment 2: Use selection sort to sort an array of strings and array list of customers");
		assignmentTwoTests();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Assignment 3: Use insertion sort to sort an array of strings and array list of customers");
		assignmentThreeTests();
	}

	private static void assignmentOneTests() {
		String[] names = initStringArray();

		System.out.println("Unsorted array of names");
		for (String s : names) {
			System.out.println(s);
		}

		System.out.println();
		System.out.println("Sorted array of names");

		BubbelSortering.bubbleSortof(names);

		for (String s : names) {
			System.out.println(s);
		}
	}

	private static void assignmentTwoTests() {
		String[] names = initStringArray();

		System.out.println("Unsorted array of names");
		for (String s : names) {
			System.out.println(s);
		}

		System.out.println();
		System.out.println("Sorted array of names");

		SelectionSort.selectionSortOf(names);

		for (String s : names) {
			System.out.println(s);
		}

		System.out.println();

		ArrayList<Customer> customers = initArrayListWithCustomer();

		System.out.println("Unsorted array list of customers");
		for (Customer c : customers) {
			System.out.println(c);
		}

		System.out.println();
		System.out.println("Sorted array list of customers");

		SelectionSort.selection(customers);

		for (Customer c : customers) {
			System.out.println(c);
		}
	}

	private static void assignmentThreeTests() {
		String[] names = initStringArray();

		System.out.println("Unsorted array of names");
		for (String s : names) {
			System.out.println(s);
		}

		System.out.println();
		System.out.println("Sorted array of names");

		InsertionSortering.insertionSortOf(names);

		for (String s : names) {
			System.out.println(s);
		}

		System.out.println();

		ArrayList<Customer> customers = initArrayListWithCustomer();

		System.out.println("Unsorted array list of customers");
		for (Customer c : customers) {
			System.out.println(c);
		}

		System.out.println();
		System.out.println("Sorted array list of customers");

		InsertionSortering.insertionSortOf(customers);

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

	private static String[] initStringArray() {
		String[] s = { "Erna", "Elly", "Laurits", "Bertha", "Christian", "August", "Marius", "John", "Tove", "Poul",
				"Torkild" };
		return s;
	}
}