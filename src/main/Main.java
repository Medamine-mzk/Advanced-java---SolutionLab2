package main;

import models.Product;
import models.Store;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Create a store
        Store store = new Store(1, "123 Main Street", 50);

        // Create products
        Product milk = new Product(1021, "Milk", "Delight", 0.700);
        Product yogurt = new Product(2510, "Yogurt", "Vitalait", 0.500);
        Product tomato = new Product(3250, "Tomato", "Sicam", 1.200);

        // Add products to the store
        store.addProduct(milk);
        store.addProduct(yogurt);
        store.addProduct(tomato);

        // Display store details
        store.displayStoreDetails();

        // Adding a product with negative price (testing validation)
        Product invalidProduct = new Product(4001, "Juice", "Tropicana", -1.500);
        store.addProduct(invalidProduct);

        // Display updated store details
        store.displayStoreDetails();
    }
}