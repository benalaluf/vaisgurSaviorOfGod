package lesson3;

import java.util.Scanner;

public class misson5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int sum = 0;
        double avg = 0;
        double counter = 0.0;
        int cd = 0;


        while (num1 > 0 || num2 > 0 || num3 > 0) {
            num1 = scn.nextInt();
            if (num1 > 0) {
                sum += num1;
                counter++;
                avg = sum / counter;
            } else {
                break;
            }
            num2 = scn.nextInt();
            if (num2 > 0) {
                sum += num2;
                counter++;
                avg = sum / counter;
            } else {
                break;
            }
            num3 = scn.nextInt();
            if (num3 > 0) {
                sum += num3;
                counter++;
                avg = sum / counter;
            } else {
                break;
            }
            if (num1 > avg) {
                cd++;
            }
            if (num2 > avg) {
                cd++;
            }
            if (num3 > avg) {
                cd++;
            }
        }
        if (counter==2){
            if (num1>num2){
                cd=1;
            }
        }
        System.out.println(cd);
    }
}
