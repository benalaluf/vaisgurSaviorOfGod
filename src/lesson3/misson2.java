package lesson3;

import java.util.Scanner;

public class misson2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        String nigger = scn.next();
//        for (int i = 0; i <nigger.length() ; i++) {
//            System.out.print(nigger.charAt(nigger.length()-i-1));
//        }


        int num = scn.nextInt();
        while (num > 0) {
            System.out.print(num % 10);
            num /= 10;
        }

    }
}
