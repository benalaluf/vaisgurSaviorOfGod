package lesson3;

import java.util.Scanner;

public class mission5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = 0;
        int lastnum = 0;
        int sum = 0;
        double avg = 0;
        double counter = 0.0;
        int biggerThenAvg = 0;


        while (num >= 0) {
            for (int i = 0; i < 2; i++) {
                lastnum = num;
                num = scn.nextInt();
                if (num > 0) {
                    sum += num;
                    counter++;
                } else {
                    break;
                }
            }
            avg = sum / counter;
            if (lastnum > avg) {
                biggerThenAvg++;
            }
        }
        avg = sum / counter;
        if (num > avg) {
            biggerThenAvg++;
        }
        System.out.println(biggerThenAvg);
    }
}
