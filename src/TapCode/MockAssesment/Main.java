package TapCode.MockAssesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.getName());
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John", "john@example.com"));
        customers.add(new Customer(2, "Alice", "alice@example.com"));
        customers.add(new Customer(3, "Bob", "bob@example.com"));

        System.out.println("Before sorting:");
        for (Customer p : customers) {
            System.out.println(p);
        }

        Collections.sort(customers);

        System.out.println("\nAfter sorting by name:");
        for (Customer p : customers) {
            System.out.println(p);
        }
    }
}
