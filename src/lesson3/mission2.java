package lesson3;

import java.util.Scanner;

public class mission2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        while (num > 0) {
            System.out.print(num % 10);
            num /= 10;
        }

    }
}
