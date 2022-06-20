package lesson3;

import java.util.Scanner;

public class misson1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int symbol = (2 * num + 1) % 2;

        if (symbol == -1) {
            num *= -1;
        }

        for (int i = 0; i < num; i++) {
            symbol *= num - i;
        }

        System.out.println(symbol);
    }
}