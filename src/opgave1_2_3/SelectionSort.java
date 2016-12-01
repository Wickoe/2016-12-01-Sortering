package opgave1_2_3;

import java.util.ArrayList;

public class SelectionSort {
	private static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int minPos = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[minPos]) {
					minPos = j;
				}

			}
			swap(list, i, minPos);
		}
	}

	public static String[] selectionSortOf(String[] names) {
		for (int i = 0; i < names.length - 1; i++) {
			int minPos = i;

			for (int j = (i + 1); j < (names.length - 1); j++) {
				if (names[j].compareTo(names[minPos]) < 0) {
					minPos = j;
				}
			}
			String aNameSwap = names[i];
			names[i] = names[minPos];
			names[minPos] = aNameSwap;
		}
		return names;
	}

	public static void selection(ArrayList<Customer> customers) {
		for (int i = 0; i < customers.size(); i++) {
			int minPos = i;

			for (int j = i + 1; j < customers.size(); j++) {
				if (customers.get(j).compareTo(customers.get(minPos)) < 0) {
					minPos = j;
				}
			}

			Customer aCustomerSwap = customers.get(i);
			customers.set(i, customers.get(minPos));
			customers.set(minPos, aCustomerSwap);
		}
	}
}