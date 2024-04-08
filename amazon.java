package org.pcap4j.Amazon;

import java.util.Scanner;

public class amazon {

    public static void main(String[] args) {
        System.out.println("Enter the choice ");
        System.out.println("1.Admin ");
        System.out.println("2.Customer ");
        System.out.println("3.Seller ");

        Scanner in = new Scanner(System.in);
        int ch = in.nextInt();
        String us;
        String pass;

        switch (ch) {
            case 1:
                System.out.println("Admin");
                System.out.println("Enter the username");
                us = in.next();
                System.out.println("Enter the password");
                pass = in.next();
                AdminClass ad = new AdminClass();

                if (us.equals(ad.username) && pass.equals(ad.password)) {
                    ad.main();
                } else {
                    System.out.println("Invalid Username or Password");
                }
                break;
            case 2:
                System.out.println("Customer");
                System.out.println("Enter the username");
                us = in.next();
                System.out.println("Enter the password");
                pass = in.next();

                AdminClass ac = new AdminClass();
                CustomerClass cs = new CustomerClass(us, pass);

                for (customer tp : ac.cusList) {

                    if (us.equals(tp.getName()) && pass.equals(tp.getPassword())) {
                        cs.main();
                    } else {
                        System.out.println("Invalid Username or Password");
                    }
                }
                break;
            case 3:
                System.out.println("Seller");
                System.out.println("Enter the username");
                us = in.next();
                System.out.println("Enter the password");
                pass = in.next();

                SellerClass se = new SellerClass(us, pass);
                if (us.equals(se.username) && pass.equals(se.password)) {
                    se.main();
                } else {
                    System.out.println("Invalid Username or Password");
                }
                break;
        }
    }
}
