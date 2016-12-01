package opgave2_3;

import java.util.ArrayList;

public class StringCustomerSelectionSort {
    public static String[] selectionSort(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[minPos]) < 0) {
                    minPos = j;
                }
            }
            String swap = list[i];
            list[i] = list[minPos];
            list[minPos] = swap;
        }
        
        return list;
    }

    public static ArrayList<Customer> selectionSort(ArrayList<Customer> toSelectionSort) {
        for (int i = 0; i < toSelectionSort.size(); i++) {
            int minPos = i;
            
            for (int j = i + 1; j < toSelectionSort.size(); j++) {
                if (toSelectionSort.get(j).compareTo(toSelectionSort.get(minPos)) < 0) {
                    minPos = j;
                }
            }
            
            Customer swap = toSelectionSort.get(i);
            toSelectionSort.set(i, toSelectionSort.get(minPos));
            toSelectionSort.set(minPos, swap);
        }
        return toSelectionSort;
    }
}
