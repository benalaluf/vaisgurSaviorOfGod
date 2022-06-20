package lesson2;

import java.util.Scanner;

public class mission8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("pls enter number - ");
        int price = scn.nextInt();
        int twohunded = 0;
        int hunderd = 0;
        int fifty = 0;
        int twenty = 0;

        if (price == 30 || price == 10 || price % 10 != 0) {
            System.out.println("impossible");
            System.exit(0);
        }

        if (price % 50 == 20) {
            twenty = 1;
        }
        if (price % 50 == 40) {
            twenty = 2;
        }
        if (price % 50 + 50 == 60) {
            twenty = 3;
        }
        if (price % 50 + 50 == 80) {
            twenty = 4;
        }

        price = price - twenty * 20;
        if (price >= 200) {
            twohunded = price / 200;
            price = price - ((price / 200) * 200);
        }
        if (price >= 100) {
            hunderd = price / 100;
            price = price - ((price / 100) * 100);
        }
        if (price >= 50) {
            fifty = price / 50;
        }

        System.out.println("200 - " + twohunded);
        System.out.println("100 - " + hunderd);
        System.out.println("50 - " + fifty);
        System.out.println("20 - " + twenty);
        System.out.println("min amount of bills - " + (twohunded + hunderd + fifty + twenty));
    }

}

