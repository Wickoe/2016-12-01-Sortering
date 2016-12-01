package opgave2_3;

import java.util.ArrayList;

public class StringCustomerInsertionSort {
    public static String[] insertionSortof(String[] toInsertionSort) {
        for (int i = 1; i < toInsertionSort.length; i++) {
            String next = toInsertionSort[i];
            int j = i;
            boolean found = false;

            while (!found && j > 0) {
                if (next.compareTo(toInsertionSort[j - 1]) > 0) {
                    found = true;
                }
                else {
                    toInsertionSort[j] = toInsertionSort[j - 1];
                    j--;
                }
            }
            toInsertionSort[j] = next;
        }
        return toInsertionSort;
    }

    public static ArrayList<Customer> insertionSortOf(ArrayList<Customer> toInsertionSort) {
        for (int i = 1; i < toInsertionSort.size(); i++) {
            Customer next = toInsertionSort.get(i);
            int j = i;
            boolean found = false;

            while (!found && j > 0) {
                if (next.compareTo(toInsertionSort.get(j - 1)) > 0) {
                    found = true;
                }
                else {
                    toInsertionSort.set(j, toInsertionSort.get(j - 1));
                    j--;
                }
            }
            toInsertionSort.set(j, next);
        }
        return toInsertionSort;
    }
}