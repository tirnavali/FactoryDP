package abstract_otel_factory.Domain;

import java.util.UUID;

public class Customer {
    private String name;
    private UUID id;

    private Customer() {
    };

    public static Customer with(String name) {
        Customer customer = new Customer();
        customer.name = name;
        customer.id = UUID.randomUUID();
        return customer;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public String toString() {
        return "Customer: " + name + " ID: " + id;
    }
}