package org.pcap4j.Amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminClass {
    String username = "Admin";
    String password = "@dmin@123";
    List<customer> cusList = new ArrayList<>();
    List<seller> sellList = new ArrayList<>();
    List<product> pdtList = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public AdminClass() {

        cusList = new ArrayList<>();
        cusList.add(new customer(1, "rd", " school St", 1234567890, "password123"));
        cusList.add(new customer(2, "dhoni", "ranchi", 987653210, "password456"));

        sellList = new ArrayList<>();
        sellList.add(new seller(1, "rd", "school St", 1112223333));
        sellList.add(new seller(2, "dhoni", "ranchi", 444556666));

        pdtList = new ArrayList<>();
        pdtList.add(new product(1, "Product1", 10.99, 100, 123456789));
        pdtList.add(new product(2, "Product2", 19.99, 50, 987654321));
    }


    void sellerDetails() {
        System.out.println("List of Sellers");

        for (seller s : sellList) {
            System.out.println("Name: " + s.getName());
            System.out.println("ID: " + s.getId());
            System.out.println("Address: " + s.getAddress());
            System.out.println("Phone Number: " + s.getPhoneNumber());
        }
    }

    void customerDetails() {
        System.out.println("List of Customers");

        for (customer c : cusList) {
            System.out.println("Name: " + c.getName());
            System.out.println("ID: " + c.getId());
            System.out.println("Address: " + c.getAddress());
            System.out.println("Phone Number: " + c.getPhoneNumber());
        }
    }

    void productDetails() {
        System.out.println("List of Product");

        for (product p : pdtList) {
            System.out.println("Name: " + p.getName());
            System.out.println("ID: " + p.getId());
            System.out.println("Price: " + p.getPrice());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("ISO: " + p.getIso());
        }
    }

    public void main() {
        int choice;
        do {
            System.out.println("--------------------------Admin Login---------------------");
            System.out.println("What details you want to know");
            System.out.println("  1.Seller details");
            System.out.println("  2.Customer details");
            System.out.println("  3.Product details");
            System.out.println("  4.Exit");
            System.out.println("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1: {
                    sellerDetails();
                    break;
                }
                case 2: {
                    customerDetails();
                    break;
                }
                case 3: {
                    productDetails();
                    break;
                }
                case 4: {
                    System.out.println("**************************Thanks for visiting!******************************");
                    break;
                }
            }

        } while (choice != 4);
    }
}
