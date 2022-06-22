package lesson4;

import java.util.Scanner;

public class mission4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[]{
                1,2,3,4,4,4,4,2,3
        };
        int sum = scn.nextInt();
        int num = scn.nextInt();
        int coutner=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                coutner++;
            }
        }
        if (coutner<sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
