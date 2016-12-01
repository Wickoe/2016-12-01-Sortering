package opgave2_3;

import java.util.ArrayList;

public class Opgave3Tester {
    public static void main(String[] args) {
        String[] unsortedStringArray = { "Erna", "Elly", "Laurits", "Bertha", "Christian",
            "August", "Marius", "John", "Tove", "Poul", "Torkild" };
        
        System.out.println("Unsorted string array");
        for (String s : unsortedStringArray) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------------------------");
        
        String[] sortedStringArray =
            StringCustomerInsertionSort.insertionSortof(unsortedStringArray);
        
        System.out.println();
        System.out.println("Sorted string array");
        for (String s : sortedStringArray) {
            System.out.println(s);
        }

        System.out.println("----------------------------------------------------------");
        ArrayList<Customer> customers = initArrayListWithCustomer();

        System.out.println();
        System.out.println("Unsorted customers");
        for (Customer c : customers) {
            System.out.println(c);
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Sorted customers");
        for (Customer c : StringCustomerInsertionSort.insertionSortOf(customers)) {
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
