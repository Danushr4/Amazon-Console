package org.pcap4j.Amazon;

import java.util.Stack;

public class customer {
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private String password;
    private Stack<String> cart;
    int NumberofOrder = 0;

    public customer() {

    }

    public customer(int id, String name, String address, long phoneNumber, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.cart = new Stack<>();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    // Cart operations
    public void addToCart(String product) {
        cart.push(product);
    }

    public void emptyCart() {
        cart.clear();
    }

    public void displayCart() {
        System.out.println("List of Products in the cart:");
        for (String item : cart) {
            System.out.println(item);
        }
    }

    public void removeFromCart() {
        if (!cart.isEmpty()) {
            cart.pop();
        } else {
            System.out.println("Cart is already empty.");
        }
    }
}
