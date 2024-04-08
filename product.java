package org.pcap4j.Amazon;

public class product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private long iso;
    String sellername;

    product() {

    }

    product(int id, String n, double pr, int qn, long iso) {
        this.id = id;
        this.name = n;
        this.price = pr;
        this.quantity = qn;
        this.iso = iso;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSellerName() {
        return sellername;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getIso() {
        return iso;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
