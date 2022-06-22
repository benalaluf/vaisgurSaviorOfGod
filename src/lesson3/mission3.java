package lesson3;

import java.util.Scanner;

public class mission3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int check1;
        int check2;

        while (num1 > 0) {
            check1 = num1 % 10;
            while (num2 > 0) {
                check2 = num2 % 10;
                if (check1 == check2) {
                    System.out.println("yes they sharing");
                    System.exit(0);
                }
                num2 /= 10;
            }
            num1 /= 10;
        }
        System.out.println("no sharing");
    }

}
