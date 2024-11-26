package models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int id;
    private String address;
    private int capacity;
    private List<Product> products;

    public Store(int id, String address, int capacity) {
        this.id = id;
        this.address = address;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Product> getProducts() {
        return products;
    }

    // 1) Add a product to the store
    public boolean addProduct(Product product) {
        if (products.size() < capacity) {
            products.add(product);
            return true;
        } else {
            System.out.println("Store is at full capacity! Cannot add more products.");
            return false;
        }
    }

    // 4) Calculate total number of products
    public int getTotalProducts() {
        return products.size();
    }

    // Display store details
    public void displayStoreDetails() {
        System.out.println("Store ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Capacity: " + capacity);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getLabel() + " | Price: " + product.getPrice());
        }
        System.out.println("Total Products: " + getTotalProducts());
    }
}
