package org.pcap4j.Amazon;

import java.util.Scanner;

public class SellerClass {
    String username = "Admin";
    String password = "@sell@444";
    Scanner in = new Scanner(System.in);

    SellerClass() {

    }

    SellerClass(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void addToInventory() {
        AdminClass ad = new AdminClass();
        for (seller s : ad.sellList) {
            if (s.getName().equals(username)) {
                char ch;
                do {
                    System.out.println("Enter the ID: ");
                    int id = in.nextInt();
                    System.out.println("Enter the name: ");
                    String name = in.next();
                    System.out.println("Enter the Price: ");
                    double price = in.nextDouble();
                    System.out.println("Enter the Quantity: ");
                    int qn = in.nextInt();
                    System.out.println("Enter the ISO Number: ");
                    long iso = in.nextLong();

                    s.MyList.add(new product(id, name, price, qn, iso));
                    ad.pdtList.add(new product(id, name, price, qn, iso));

                    System.out.println("Do you want to add another product? (Y/N)");
                    ch = in.next().charAt(0);
                } while (ch == 'Y' || ch == 'y');
            }
        }
    }

    public void viewSellerProducts() {
        System.out.println("List the products of the seller");
        AdminClass ad = new AdminClass();

        for (seller s : ad.sellList) {
            if (s.getName().equals(username)) {
                s.Display();
            }
        }
    }

    public void main() {
        int choice;
        do {
            System.out.println("--------------------------Seller login-------------------------");
            System.out.println("What you want to do");
            System.out.println("  1.Add products to inventory");
            System.out.println("  2.View my products");
            System.out.println("  3.Exit");
            System.out.println("Enter your choice");
            choice = in.nextInt();
            switch (choice) {
                case 1: {
                    addToInventory();
                    break;
                }
                case 2: {
                    viewSellerProducts();
                    break;
                }
                case 3: {
                    System.out.println("**************************Thanks for visiting!******************************");
                    break;
                }
            }
        } while (choice != 3);
    }
}
