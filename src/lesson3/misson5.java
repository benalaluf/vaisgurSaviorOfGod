package lesson3;

import java.util.Scanner;

public class misson5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = 0;
        int lastnum = 0;
        int sum = 0;
        double avg = 0;
        double counter = 0.0;
        int cd = 0;


        while (num1 >= 0) {
            for (int i = 0; i < 2; i++) {
                lastnum = num1;
                num1 = scn.nextInt();
                if (num1 > 0) {
                    sum += num1;
                    counter++;
                } else {
                    break;
                }

            }
            avg = sum / counter;
            if (lastnum > avg) {
                cd++;
            }
        }
        avg = sum / counter;
        if (num1 > avg){
            cd++;
        }

        System.out.println(cd);
    }
}
