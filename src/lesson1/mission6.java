package lesson1;

import java.util.Scanner;

public class mission6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();    //input number
        int odd = (num+1) % 2;
        int even = (num) % 2;
        int symbol = (2 * num + 1) % 2;
        int absNum = symbol*num;


        System.out.println("abs of num = " + absNum);

    }
}
