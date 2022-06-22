package lesson4;

import java.util.Scanner;

public class mission6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int[] array = new int[]{
                1, 5, 7, 8, 9, 10, 100, 123
        };
        int coutner=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[i]+array[j] == s&& i!=j){
                    coutner++;
                }
            }
        }

        if (coutner> 0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
