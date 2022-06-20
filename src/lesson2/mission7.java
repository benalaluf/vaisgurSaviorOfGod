package lesson2;

import java.util.Scanner;

public class mission7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int runx = scn.nextInt();
        int runy = scn.nextInt();
        int absrun = Math.abs(runx-runy);
        int rookx = scn.nextInt();
        int rooky = scn.nextInt();
        int absrook = Math.abs(rookx-rooky);


        if (absrook==  absrun) {
            System.out.println("is bad");
        }
    }
}
