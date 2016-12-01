package opgave5;

public class SortMethods {

	public static void bubbleSort(String[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					String aNameSwap = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aNameSwap;
				}
			}
		}
	}

	public static void insertionSort(String[] array) {
		for (int i = 1; i < array.length; i++) {
			String next = array[i];
			int j = i;
			boolean found = false;

			while (!found && j > 0) {
				if (next.compareToIgnoreCase(array[j - 1]) > 0) {
					found = true;
				} else {
					array[j] = array[j - 1];
					j--;
				}
			}
			array[j] = next;
		}
	}

	public static void selectionSort(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minPos = i;

			for (int j = (i + 1); j < (array.length - 1); j++) {
				if (array[j].compareTo(array[minPos]) < 0) {
					minPos = j;
				}
			}
			String aNameSwap = array[i];
			array[i] = array[minPos];
			array[minPos] = aNameSwap;
		}
	}

}
