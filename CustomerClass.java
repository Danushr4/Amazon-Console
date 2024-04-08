package org.pcap4j.Amazon;

import java.util.Scanner;

public class CustomerClass {
    String username = "Admin";
    String password = "@cus@777";
    Scanner in = new Scanner(System.in);
    AdminClass ad = new AdminClass();

    CustomerClass() {

    }

    CustomerClass(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void orderProduct() {
        System.out.println("List of products");

        for (product pd : ad.pdtList) {
            System.out.println("Id: " + pd.getId() +
                    " Name: " + pd.getName() +
                    " Price: " + pd.getPrice() +
                    " ISO: " + pd.getIso() +
                    " Quantity: " + pd.getQuantity());
        }
        System.out.println("Select the product:");

        String str = in.next();

        for (customer cu : ad.cusList) {
            if (cu.getName().equals(username)) {
                cu.NumberofOrder++;

                System.out.println("Your order has been placed the product " + str + " will reach by April 10 2024");
            }
        }

        for (product cu : ad.pdtList) {
            if (cu.getName().equals(str)) {
                int qn = cu.getQuantity();
                qn--;
                cu.setQuantity(qn);
            }
        }
    }

    public void viewCart() {
        for (customer cu : ad.cusList) {
            if (cu.getName().equals(username)) {
                cu.displayCart();
            }
        }
    }

    public void main() {
        int choice;
        do {
            System.out.println("-------------------------Welcome - Amazon user-----------------------");
            System.out.println("  1.Order product:");
            System.out.println("  2.View Cart:");
            System.out.println("  3.Exit");
            System.out.println("Enter your choice:");
            choice = in.nextInt();
            switch (choice) {
                case 1: {
                    orderProduct();
                    break;
                }
                case 2: {
                    viewCart();
                    break;
                }
                case 3: {
                    System.out.println("**************************Thanks for visiting!******************************");
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}
