package org.pcap4j.Amazon;

import java.util.ArrayList;
import java.util.List;

public class seller {
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    List<product> MyList;

    public seller() {

    }

    public seller(int id, String name, String address, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.MyList = new ArrayList<>();
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void Display() {
        System.out.println("List of Products");

        for (product pd : MyList) {
            System.out.println("Id: " + pd.getId() +
                    " Name: " + pd.getName() +
                    " Price: " + pd.getPrice() +
                    " ISO: " + pd.getIso() +
                    " Quantity: " + pd.getQuantity());
        }
    }
}
