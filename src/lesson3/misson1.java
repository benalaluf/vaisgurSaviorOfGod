package lesson3;

import java.util.Scanner;

public class misson1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int fin = num;
        for (int i = 1; i < num; i++) {

            fin *= num-i;

        }
        System.out.println(fin);
    }
}
