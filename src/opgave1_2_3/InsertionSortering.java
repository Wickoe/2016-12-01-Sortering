package opgave1_2_3;

import java.util.ArrayList;

public class InsertionSortering {
	public static void insertioneSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int next = list[i];
			int j = i;
			boolean found = false;
			while (!found && j > 0) {
				if (next >= list[j - 1]) {
					found = true;
				} else {
					list[j] = list[j - 1];
					j--;
				}
			}
			list[j] = next;
		}
	}

	public static void insertionSortOf(String[] names) {
		for (int i = 1; i < names.length; i++) {
			String next = names[i];
			int j = i;
			boolean found = false;

			while (!found && j > 0) {
				if (next.compareToIgnoreCase(names[j - 1]) > 0) {
					found = true;
				} else {
					names[j] = names[j - 1];
					j--;
				}
			}
			names[j] = next;
		}
	}

	public static void insertionSortOf(ArrayList<Customer> customers) {
		for (int i = 1; i < customers.size(); i++) {
			Customer next = customers.get(i);
			int j = i;
			boolean found = false;

			while (!found && j > 0) {
				if (next.compareTo(customers.get(j - 1)) > 0) {
					found = true;
				} else {
					customers.set(j, customers.get(j - 1));
					j--;
				}
			}
			customers.set(j, next);
		}
	}
}