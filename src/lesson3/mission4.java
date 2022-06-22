package lesson3;

import java.util.Scanner;

public class mission4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int powerOfThree= 0;
        int counter = 0;
        while (powerOfThree<=num){
            powerOfThree = (int) Math.pow(3,counter);
            counter++;
        }
        System.out.println(powerOfThree);
    }
}
